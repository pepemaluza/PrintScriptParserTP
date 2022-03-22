package logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import token.TokenType;

public interface LexMatcher {
    Pattern getPattern();

    TokenType getTokenType();

    Matcher getMatcher(String input);
}