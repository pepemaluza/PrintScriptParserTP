

package logic;

import token.TokenType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexMatcherImpl implements LexMatcher {

    private final Pattern pattern;
    private final TokenType tokenType;

    public LexMatcherImpl(String lexeme, TokenType tokenType) {
        this.pattern = Pattern.compile(lexeme);
        this.tokenType = tokenType;
    }

    @Override
    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public TokenType getTokenType() {
        return tokenType;
    }

    @Override
    public Matcher getMatcher(String input) {
        return pattern.matcher(input);
    }
}