package Week11.Bishop;

public class Bishop extends Piece {

  /**
   * hi.
   * @param coordinatesX is X.
   * @param coordinatesY is Y.
   */
  public Bishop(int coordinatesX, int coordinatesY) {
    super(coordinatesX, coordinatesY);
  }

  /**
   * hi.
   * @param coordinatesX is x.
   * @param coordinatesY is y.
   * @param color        is col.
   */
  public Bishop(int coordinatesX, int coordinatesY, String color) {
    super(coordinatesX, coordinatesY, color);
  }

  @Override
  public String getSymbol() {
    return "B";
  }

  @Override
  public boolean canMove(Board board, int x, int y) {
    if (!board.validate(x, y)) {
      return false;
    }
    if (this.getCoordinatesX() == x && this.getCoordinatesY() == y) {
      return false;
    }

    boolean ok = false;

    if (this.getCoordinatesX() + this.getCoordinatesY() == x + y) {
      ok = true;
    }
    if (this.getCoordinatesX() - this.getCoordinatesY() == x - y) {
      ok = true;
    }

    if (!ok) {
      return false;
    }

    String color = this.getColor();
    int xx = getCoordinatesX();
    int yy = getCoordinatesY();

    for (int i = 0; i < board.getPieces().size(); i++) {
      Piece here = board.getPieces().get(i);
      if (here.getCoordinatesX() == x && here.getCoordinatesY() == y
          && color.equals(here.getColor())) {
        return false;
      }
      if (here.getCoordinatesX() >= Math.max(x, xx)) {
        continue;
      }
      if (here.getCoordinatesY() >= Math.max(y, yy)) {
        continue;
      }
      if (here.getCoordinatesX() <= Math.min(x, xx)) {
        continue;
      }
      if (here.getCoordinatesY() <= Math.min(y, yy)) {
        continue;
      }
      if (here.getCoordinatesX() + here.getCoordinatesY() != xx + yy
          || here.getCoordinatesX() - here.getCoordinatesY() != xx - yy) {
        return false;
      }
    }

    return true;
  }
}
