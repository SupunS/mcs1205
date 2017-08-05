package sample.language.parser;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * Error Handling strategy.
 */
public class ParserErrorStrategy extends DefaultErrorStrategy {

    @Override
    public void recover(Parser parser, RecognitionException e) {
        Token missingSymbol = parser.getCurrentToken();
        int line = missingSymbol.getLine();
        int position = missingSymbol.getCharPositionInLine();
        String mismatchedToken = getTokenErrorDisplay(missingSymbol);
        String msg = getSourceLocation(parser, line, position) + "invalid token " + mismatchedToken + ". "
                + e.getMessage();
        setContextException(parser);
        throw new ParseCancellationException(msg);
    }

    @Override
    public void reportInputMismatch(Parser parser, InputMismatchException e) {
        int line = getMissingSymbol(parser).getLine();
        int position = getMissingSymbol(parser).getCharPositionInLine();
        String mismatchedToken = getTokenErrorDisplay(e.getOffendingToken());
        String expectedToken = e.getExpectedTokens().toString(parser.getVocabulary());
        String msg = getSourceLocation(parser, line, position) + "mismatched input " + mismatchedToken
                + ". Expecting one of " + expectedToken;
        setContextException(parser);
        throw new ParseCancellationException(msg);
    }

    @Override
    public void reportMissingToken(Parser parser) {
        Token token = parser.getCurrentToken();
        IntervalSet expecting = getExpectedTokens(parser);
        int line = getMissingSymbol(parser).getLine();
        int position = getMissingSymbol(parser).getCharPositionInLine();
        String missingToken = expecting.toString(parser.getVocabulary());
        String msg = getSourceLocation(parser, line, position) + "missing " + missingToken + " before "
                + getTokenErrorDisplay(token);
        setContextException(parser);
        throw new ParseCancellationException(msg);
    }

    @Override
    public void reportNoViableAlternative(Parser parser, NoViableAltException e) {
        Token token = parser.getCurrentToken();
        int line = getMissingSymbol(parser).getLine();
        int position = getMissingSymbol(parser).getCharPositionInLine();
        String msg = getSourceLocation(parser, line, position) + "invalid identifier " + getTokenErrorDisplay(token);
        setContextException(parser);
        throw new ParseCancellationException(msg);
    }

    @Override
    public void reportUnwantedToken(Parser parser) {
        Token token = parser.getCurrentToken();
        int line = getMissingSymbol(parser).getLine();
        int position = getMissingSymbol(parser).getCharPositionInLine();
        String msg = getSourceLocation(parser, line, position) + "unwanted token " + getTokenErrorDisplay(token);
        setContextException(parser);
        throw new ParseCancellationException(msg);
    }

    @Override
    public void reportFailedPredicate(Parser parser, FailedPredicateException e) {
        int line = getMissingSymbol(parser).getLine();
        int position = getMissingSymbol(parser).getCharPositionInLine();
        setContextException(parser);
        throw new ParseCancellationException(getSourceLocation(parser, line, position) + e.getMessage());
    }

    public void reportError(Parser parser, RecognitionException e) {
        if (e instanceof NoViableAltException) {
            reportNoViableAlternative(parser, (NoViableAltException) e);
        } else if (e instanceof InputMismatchException) {
            reportInputMismatch(parser, (InputMismatchException) e);
        } else if (e instanceof FailedPredicateException) {
            reportFailedPredicate(parser, (FailedPredicateException) e);
        } else {
            int line = getMissingSymbol(parser).getLine();
            int position = getMissingSymbol(parser).getCharPositionInLine();
            setContextException(parser);
            throw new ParseCancellationException(getSourceLocation(parser, line, position) + e.getMessage());
        }
    }

    /**
     * Set an exception in the parser context. This is later used at
     * {@link ParserListnerImpl} level to determine whether the parse exception
     * has occurred and is in error state.
     * 
     * @param parser Current parser
     */
    private void setContextException(Parser parser) {
        // Here the type of the exception is not important.
        InputMismatchException e = new InputMismatchException(parser);
        for (ParserRuleContext context = parser.getContext(); context != null; context = context.getParent()) {
            context.exception = e;
        }
    }

    private String getSourceLocation(Parser parser, int line, int position) {
        return parser.getSourceName() + ":" + line + ":" + position + ": ";
    }

}
