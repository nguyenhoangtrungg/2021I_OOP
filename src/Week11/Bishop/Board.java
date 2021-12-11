package Week11.Bishop;

import java.util.ArrayList;

public class Board {

  public static final int WIDTH = 8;
  public static final int HEIGHT = 8;
  private ArrayList<Piece> pieces = new ArrayList<>();

  public Board() {
  }

  public boolean validate(int x, int y) {
    return x >= 1 && x <= WIDTH && y >= 1 && y <= HEIGHT;
  }

  /**
   * hi.
   * @param piece is p.
   */
  public void addPiece(Piece piece) {
    if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
      return;
    }
    for (Piece value : pieces) {
      if (piece.getCoordinatesX() == value.getCoordinatesX()
          && piece.getCoordinatesY() == value.getCoordinatesY()) {
        return;
      }
    }
    pieces.add(piece);
  }

  /**
   * hi.
   * @param x is x.
   * @param y is y.
   * @return y.
   */
  public Piece getAt(int x, int y) {
    for (Piece p : pieces) {
      if (x == p.getCoordinatesX() && y == p.getCoordinatesY()) {
        return p;
      }
    }
    return null;
  }

  /**
   * hi.
   * @param x is x.
   * @param y is y.
   */
  public void removeAt(int x, int y) {
    for (Piece p : pieces) {
      if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
        pieces.remove(p);
        return;
      }
    }
  }

  public ArrayList<Piece> getPieces() {
    return pieces;
  }

  public void setPieces(ArrayList<Piece> pieces) {
    this.pieces = pieces;
  }

}
