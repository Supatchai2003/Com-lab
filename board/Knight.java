package board;
public class Knight extends Figure {
    public Knight(String color, int row, int col) {
        super("Knight", color, row, col);
    }

    @Override
    public boolean freeMove(int newRow, int newCol) {
        if (!isSameColor(newRow, newCol)) {
            if (Math.abs(newRow - getRow()) == 2 && Math.abs(newCol - getCol()) == 1) {
                return true;
            } else if (Math.abs(newRow - getRow()) == 1 && Math.abs(newCol - getCol()) == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean isLegalMove(int newRow, int newCol) {
        if (freeMove(newRow, newCol)) {
            return true;
        }
        return false;
    }
}
