package Test;

public class Circle extends Shape {

  protected double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * this.radius * Math.PI;
  }

  @Override
  public void draw() {
    System.out.println("This is a Circle");
  }

}
