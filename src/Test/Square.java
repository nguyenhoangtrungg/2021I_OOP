package Test;

public class Square extends Rectangle {

  public Square() {
  }

  public Square(double side) {
    width = length = side;
  }

  public double getSide() {
    return super.getLength();
  }

  public void setSide(double side) {
    super.setLength(side);
    super.setWidth(side);
  }

  @Override
  public void setWidth(double side) {
    super.setWidth(side);
    super.setLength(side);
  }

  @Override
  public void setLength(double side) {
    super.setLength(side);
    super.setWidth(side);
  }

  @Override
  public double getPerimeter() {
    return super.getPerimeter();
  }

  @Override
  public void draw() {
    System.out.println("This is a Square");
  }
}
