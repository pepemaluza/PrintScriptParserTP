package Expression;

import Visitor.ExpressionVisitor;

public interface Expression {
    Object accept(ExpressionVisitor visitor);
}