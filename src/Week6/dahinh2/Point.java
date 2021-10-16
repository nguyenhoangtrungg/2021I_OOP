package Week6.dahinh2;

public class Point {

  private double pointX;
  private double pointY;

  /**
   * hi.
   * @param pointX is X.
   * @param pointY is Y.
   */
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
   * @param point is po.
   * @return is po.
   */
  public double distance(Point point) {
    double pointx = point.pointX - this.pointX;
    double pointy = point.pointY - this.pointY;
    return Math.sqrt(pointx * pointx - pointy * pointy);
  }

  /**
   * dsad.
   * @param object ds.
   * @return dsa.
   */
  public boolean equals(Object object) {
    if (object instanceof Point) {
      boolean pointx = Math.abs(((Point) object).pointX - this.pointX) <= 0.001;
      boolean pointy = Math.abs(((Point) object).pointY - this.pointY) <= 0.001;
      return pointx && pointy;
    }
    return false;
  }

  public int hashCode() {
    return 0;
  }

  public String toString() {
    return String.format("(%.1f,%.1f)", pointX, pointY);
  }

}
