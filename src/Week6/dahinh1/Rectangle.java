package Week6.dahinh1;

public class Rectangle extends Shape {

  protected double width;
  protected double length;

  public Rectangle() {
  }

  /**
   * hi.
   * @param width  is wi.
   * @param length is le.
   */
  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  /**
   * hi.
   * @param width  is wi.
   * @param length is len.
   * @param color  is col.
   * @param filled is fil.
   */
  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
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
  public double getArea() {
    return this.width * this.length;
  }

  @Override
  public double getPerimeter() {
    return (this.width + this.length) * 2;
  }

  @Override
  public String toString() {
    return "Rectangle["
        + "width=" + width
        + ",length=" + length
        + ",color=" + color
        + ",filled=" + filled
        + ']';
  }
}
