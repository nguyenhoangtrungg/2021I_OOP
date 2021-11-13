package Week10.CoVua;

public class Rook extends Piece {

  /**
   * hi.
   *
   * @param coordinatesX is X.
   * @param coordinatesY is Y.
   */
  public Rook(int coordinatesX, int coordinatesY) {
    super(coordinatesX, coordinatesY);
  }

  /**
   * hi.
   *
   * @param coordinatesX is X.
   * @param coordinatesY is Y.
   * @param color        is color.
   */
  public Rook(int coordinatesX, int coordinatesY, String color) {
    super(coordinatesX, coordinatesY, color);
  }

  @Override
  public String getSymbol() {
    return "R";
  }

  @Override
  public boolean canMove(Board board, int x, int y) {
    if (!board.validate(x, y)) {
      return false;
    }
    if (this.getCoordinatesX() == x && this.getCoordinatesY() == y) {
      return false;
    }
    if (this.getCoordinatesX() != x && this.getCoordinatesY() != y) {
      return false;
    }
    int[][] boar = new int[Board.WIDTH + 2][Board.HEIGHT + 2];
    for (int i = 1; i <= Board.WIDTH; i++) {
      for (int j = 1; j <= Board.HEIGHT; j++) {
        boar[i][j] = 0;
      }
    }
    String color = this.getColor();
    int xx = getCoordinatesX();
    int yy = getCoordinatesY();

    for (int i = 0; i < board.getPieces().size(); i++) {
      Piece here = board.getPieces().get(i);
      boar[here.getCoordinatesX()][here.getCoordinatesY()] = 1;
      if (!color.equals(here.getColor())
          && x == here.getCoordinatesX() && y == here.getCoordinatesY()) {
        boar[here.getCoordinatesX()][here.getCoordinatesY()] = 0;
      }
      if (color.equals(here.getColor())
          && xx == here.getCoordinatesX() && yy == here.getCoordinatesY()) {
        boar[here.getCoordinatesX()][here.getCoordinatesY()] = 0;
      }
    }

    if (y == yy) {
      for (int i = Math.min(x, xx); i <= Math.max(x, xx); i++) {
        if (boar[i][yy] == 1) {
          return false;
        }
      }
    }
    if (x == xx) {
      for (int i = Math.min(y, yy); i <= Math.max(y, yy); i++) {
        if (boar[xx][i] == 1) {
          return false;
        }
      }
    }
    return true;
  }
}
