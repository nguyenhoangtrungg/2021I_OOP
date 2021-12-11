package Week11.Bishop;

public class Main {
  public static void main(String[] args) {
    Board board = new Board();
    Game game = new Game(board);
    Piece rook1 = new Bishop(2, 2, "white");
    Piece rook2 = new Bishop(3, 4, "black");
    System.out.print(rook1.canMove(board, 3, 3));
//    //Piece rook3 = new Rook(3, 3, "white");
//    board.addPiece(rook1);
//    board.addPiece(rook2);
//    //board.addPiece(rook3);
//    //System.out.println(board.getAt(1, 1));
//    //System.out.println(board.getAt(1, 1));
//    System.out.println(rook1.canMove(board, 1, 5));
////    game.movePiece(rook1, 3, 1);
////    System.out.println(board.getAt(1, 1));
////    System.out.println(game.getMoveHistory());
////    System.out.println(rook1.getCoordinatesX() + " " + rook1.getCoordinatesY());
////    System.out.println(game.getBoard().getPieces());
  }
}
