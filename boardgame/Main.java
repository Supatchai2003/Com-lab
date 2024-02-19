package boardgame;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(8);
        Figure whiteRook = new Figure("w", "White", 1, 1);
        Figure blackRook = new Figure("b", "White", 2,1);

        board.setFigure(whiteRook);
        board.setFigure(blackRook);

        board.displayBoard();

        board.moveFigure(whiteRook, 0, 7);
        board.displayBoard();

        board.moveFigure(whiteRook, 1, 7);
        board.displayBoard();
    }
}
