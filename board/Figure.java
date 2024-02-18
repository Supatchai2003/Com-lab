package board;

public class Figure {
    private String name;
    private String color;
    private int row;
    private int col;
    public ChessBoard chessBoard;

    public Figure(String name, String color, int row, int col) {
        this.name = name;
        this.color = color;
        this.row = row;
        this.col = col;
        
    }

    public boolean freeMove(int newRow, int newCol) {
        if (!isSameColor(newRow, newCol)) {
            return true;
        }
        return false;
    }

    public boolean isSameColor(int newRow, int newCol) {
        if (chessBoard.isposition(newRow, newCol)) {
            return chessBoard.getFigure(newRow, newCol).getColor()==(color);
        }
        return false;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getColor() {
        return color;
    }
    
}
