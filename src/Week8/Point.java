package Week8;

public class Point {

  private double pointX;
  private double pointY;

  public Point(double pointX, double pointY) {
    this.pointX = pointX;
    this.pointY = pointY;
  }

  public double getPointX() {
    return pointX;
  }

  public void setPointX(double pointX) {
    this.pointX = pointX;
  }

  public double getPointY() {
    return pointY;
  }

  public void setPointY(double pointY) {
    this.pointY = pointY;
  }

  /**
   * hi.
   * @param other is other.
   * @return other.
   */
  public double distance(Point other) {
    double toadoX = pointX - other.pointX;
    double toadoY = pointY - other.pointY;
    return Math.sqrt(toadoX * toadoX + toadoY * toadoY);
  }
}
