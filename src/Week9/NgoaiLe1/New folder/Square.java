

public class Square extends Expression {

  private Expression expression;

  public Square(Expression expression) {
    this.expression = expression;
  }

  @Override
  public String toString() {
    return String.format("(%s) ^ 2", expression);
  }

  @Override
  public double evaluate() {
    return expression.evaluate() * expression.evaluate();
  }
}
