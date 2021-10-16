package Week6.dahinh1;

public class Square extends Rectangle {

  public Square() {
  }

  public Square(double side) {
    width = length = side;
  }

  /**
   * hi.
   * @param side   is side.
   * @param color  is color.
   * @param filled is fill.
   */
  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
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
  public String toString() {
    return "Square["
        + "size=" + this.width
        + ",color=" + this.color
        + ",filled=" + this.filled
        + ']';
  }
}
