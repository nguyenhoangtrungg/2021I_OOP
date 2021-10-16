package Week6.dahinh2;

public class Circle extends Shape {

  protected double radius;
  protected Point center;

  public Circle() {
  }

  /**
   * hi.
   *
   * @param radius is rad.
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**
   * hi.
   *
   * @param radius is rad.
   * @param color  is col.
   * @param filled is filled.
   */
  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  /**
   * dsad.
   * @param center dsd.
   * @param radius das.
   * @param color das.
   * @param filled as.
   */
  public Circle(Point center, double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
    this.center = center;
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

  public Point getCenter() {
    return center;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  /**
   * hi.
   * @param object is a.
   * @return is a.
   */
  public boolean equals(Object object) {
    if (object instanceof Circle) {
      boolean pointx = Math.abs(((Circle) object).radius - this.radius) <= 0.001;
      return center.equals(((Circle) object).center) && pointx;
    }
    return false;
  }

  public int hashCode() {
    return 0;
  }

  @Override
  public String toString() {
    return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
        center.toString(), radius, color, filled);
  }
}
