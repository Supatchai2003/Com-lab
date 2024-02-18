package board;
public class Main {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        Knight knight = new Knight("White", 0, 2);
        Knight knight1 = new Knight("black", 0, 1);

        System.out.println(chessBoard.moveFigure(knight, 2, 2)); // true
        System.out.println(chessBoard.moveFigure(knight1, 2, 2)); // false
    }
}

