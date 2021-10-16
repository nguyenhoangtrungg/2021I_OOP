package Week6.dahinh2;

public class Rectangle extends Shape {

  protected double width;
  protected double length;
  protected Point topLeft;

  public Rectangle() {
  }

  /**
   * hi.
   *
   * @param width  is wi.
   * @param length is le.
   */
  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  /**
   * hi.
   *
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

  /**
   * dasdsa.
   * @param topLeft ad.
   * @param width as.
   * @param length asd.
   * @param color das.
   * @param filled ads.
   */
  public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
    this.topLeft = topLeft;
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

  public Point getTopLeft() {
    return topLeft;
  }

  public void setTopLeft(Point topLeft) {
    this.topLeft = topLeft;
  }

  /**
   * hi.
   * @param object is ob.
   * @return ab.
   */
  public boolean equals(Object object) {
    if (object instanceof Rectangle) {
      boolean pointx = Math.abs(((Rectangle) object).width - this.width) <= 0.001;
      boolean pointy = Math.abs(((Rectangle) object).length - this.length) <= 0.001;
      return topLeft.equals(((Rectangle) object).topLeft) && pointx && pointy;
    }
    return false;
  }

  public int hashCode() {
    return 0;
  }

  @Override
  public String toString() {
    return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%s]",
        topLeft.toString(), width, length, color, filled);
  }
}
