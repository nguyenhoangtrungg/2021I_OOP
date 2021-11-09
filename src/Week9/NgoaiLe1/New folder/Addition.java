

public class Addition extends BinaryExpression {

  public Addition(Expression left, Expression right) {
    super(left, right);
  }

  @Override
  public String toString() {
    return String.format("(%s + %s)", left, right);
  }

  @Override
  public double evaluate() {
    return right.evaluate() + left.evaluate();
  }
}
