package Logic;

import Statement.Statement;
import token.Token;
import Exception.ParserException;
import java.util.List;

public interface Parser {
    List<Statement> parse(List<Token> tokens) throws ParserException;
}
