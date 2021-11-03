package Test;

public class Rectangle extends Shape {

  protected double width;
  protected double length;

  public Rectangle() {
  }

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return this.length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public double getPerimeter() {
    return (this.width + this.length) * 2;
  }

  @Override
  public void draw() {
    System.out.println("This is a Rectangle");
  }
}
