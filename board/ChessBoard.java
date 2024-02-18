package board;

public class ChessBoard {
    private Figure[][] board;

    public ChessBoard() {
        board = new Figure[8][8];
    }

    public boolean isposition(int row, int col) {
        return board[row][col] != null;
    }

    public boolean moveFigure(Figure figure, int newRow, int newCol) {
        if (!isposition(newRow, newCol)) {
            board[newRow][newCol] = figure;
            board[figure.getRow()][figure.getCol()] = null;
            figure.setRow(newRow);
            figure.setCol(newCol);
            return true;
        }
        return false;
    }

    public Figure getFigure(int row, int col) {
        return board[row][col];
    }

    public Figure[][] getBoard() {
        return board;
    }
}
