package logic;

import exception.LexerException;
import java.io.InputStreamReader;
import java.util.List;
import token.Token;

public interface Lexer {
    List<Token> getTokens(InputStreamReader source, boolean boolActive, boolean constActive) throws LexerException;
}