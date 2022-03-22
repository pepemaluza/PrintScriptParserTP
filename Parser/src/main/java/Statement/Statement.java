package Statement;

import Expression.Expression;
import Visitor.StatementVisitor;

public interface Statement {

    Expression getExpression();
    void accept(StatementVisitor visitor);

}