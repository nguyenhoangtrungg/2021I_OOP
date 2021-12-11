package Week11.Bishop;

public abstract class Piece {

  private int coordinatesX;
  private int coordinatesY;
  private String color;

  /**
   * hi.
   * @param coordinatesX is X.
   * @param coordinatesY is Y.
   */
  public Piece(int coordinatesX, int coordinatesY) {
    this.coordinatesX = coordinatesX;
    this.coordinatesY = coordinatesY;
  }

  /**
   * hi.
   * @param coordinatesX is X.
   * @param coordinatesY is Y.
   * @param color is color.
   */
  public Piece(int coordinatesX, int coordinatesY, String color) {
    this.coordinatesX = coordinatesX;
    this.coordinatesY = coordinatesY;
    this.color = color;
  }

  public int getCoordinatesX() {
    return coordinatesX;
  }

  public void setCoordinatesX(int coordinatesX) {
    this.coordinatesX = coordinatesX;
  }

  public int getCoordinatesY() {
    return coordinatesY;
  }

  public void setCoordinatesY(int coordinatesY) {
    this.coordinatesY = coordinatesY;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * hi.
   * @param piece is p.
   * @return p.
   */
  public boolean checkPosition(Piece piece) {
    int x = piece.getCoordinatesX();
    int y = piece.getCoordinatesY();
    if (x < 1 || x > Board.WIDTH) {
      return false;
    }
    if (y < 1 || y > Board.HEIGHT) {
      return false;
    }
    return true;
  }

  public abstract String getSymbol();

  public abstract boolean canMove(Board board, int x, int y);
}
