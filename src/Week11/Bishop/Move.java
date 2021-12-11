package Week11.Bishop;

public class Move {

  private Piece movedPiece;
  private int startX;
  private int startY;
  private int endX;
  private int endY;
  private Piece killedPiece;

  /**
   * hi.
   *
   * @param startX     is X.
   * @param endX       is X.
   * @param startY     is Y.
   * @param endY       is Y.
   * @param movedPiece is move.
   */
  public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
    this.startX = startX;
    this.startY = startY;
    this.endX = endX;
    this.endY = endY;
    this.movedPiece = movedPiece;
  }

  /**
   * hi.
   *
   * @param startX      is X.
   * @param endX        is X.
   * @param startY      is Y.
   * @param endY        is Y.
   * @param movedPiece  is Piece.
   * @param killedPiece is Piece.
   */
  public Move(int startX, int startY, int endX, int endY, Piece movedPiece, Piece killedPiece) {
    this.startX = startX;
    this.endX = endX;
    this.startY = startY;
    this.endY = endY;
    this.movedPiece = movedPiece;
    this.killedPiece = killedPiece;
  }

  public Piece getMovedPiece() {
    return movedPiece;
  }

  public void setMovedPiece(Piece movedPiece) {
    this.movedPiece = movedPiece;
  }

  public int getStartX() {
    return startX;
  }

  public void setStartX(int startX) {
    this.startX = startX;
  }

  public int getEndX() {
    return endX;
  }

  public void setEndX(int endX) {
    this.endX = endX;
  }

  public int getStartY() {
    return startY;
  }

  public void setStartY(int startY) {
    this.startY = startY;
  }

  public int getEndY() {
    return endY;
  }

  public void setEndY(int endY) {
    this.endY = endY;
  }

  public Piece getKilledPiece() {
    return killedPiece;
  }

  public void setKilledPiece(Piece killedPiece) {
    this.killedPiece = killedPiece;
  }

  public String getAlpha(int x) {
    return String.valueOf((char) (x + 96));
  }

  @Override
  public String toString() {
    return String.format("%s-%s%s%s",
        movedPiece.getColor(),
        movedPiece.getSymbol(),
        getAlpha(endX), endY);
  }
}
