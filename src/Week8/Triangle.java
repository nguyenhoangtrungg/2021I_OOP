package Week8;

public class Triangle implements GeometricObject {

  private Point p1;
  private Point p2;
  private Point p3;

  /**
   * hi.
   * @param p1 is p1.
   * @param p2 is p2.
   * @param p3 is p3.
   */
  public Triangle(Point p1, Point p2, Point p3) {
    double x = p1.distance(p2);
    double y = p2.distance(p3);
    double z = p3.distance(p1);
    if (x + y <= z || x + z <= y || y + z <= x) {
      throw new RuntimeException();
    }
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  public Point getP1() {
    return p1;
  }

  public Point getP2() {
    return p2;
  }

  public Point getP3() {
    return p3;
  }

  @Override
  public double getArea() {
    return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
        + p2.getPointX() * (p3.getPointY() - p1.getPointY())
        + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
  }

  @Override
  public double getPerimeter() {
    return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
  }

  @Override
  public String getInfo() {
    return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
        p1.getPointX(), p1.getPointY(), p2.getPointX(), p2.getPointY(),
        p3.getPointX(), p3.getPointY());
  }
}
