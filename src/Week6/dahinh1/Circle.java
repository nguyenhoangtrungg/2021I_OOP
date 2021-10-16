package Week6.dahinh1;

public class Circle extends Shape {

  protected double radius;

  public Circle() {
  }

  /**
   * hi.
   * @param radius is rad.
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**
   * hi.
   * @param radius is rad.
   * @param color  is col.
   * @param filled is filled.
   */
  Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return this.radius * this.radius * Math.PI;
  }

  @Override
  public double getPerimeter() {
    return 2 * this.radius * Math.PI;
  }

  @Override
  public String toString() {
    return "Circle["
        + "radius=" + this.radius
        + ",color=" + this.color
        + ",filled=" + this.filled
        + ']';
  }
}
