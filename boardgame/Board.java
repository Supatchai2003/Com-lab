package boardgame;

public class Board {
    private Figure[][] f;
    private int size;
    public Board(int size) {
        this.size = size;
        this.f = new Figure[size][size];
    }

    public void setFigure(Figure figure) {
        int nrow = figure.getrow();
        int ncol = figure.getcol();
        if (nrow < 0 || nrow >= size || ncol < 0 || ncol >= size) {
            System.out.println("ไม่มีพื้นที่");
            return;
        }
        if (f[nrow][ncol] != null) {
            System.out.println("พื้นที่ตรงนี้ไม่ว่าง");
            return;
        }
        f[nrow][ncol] = figure;
    }
        public void moveFigure(Figure figure, int drow, int dcol) {
            if (!figure.freeMove(drow, dcol, this)) {
                return;
            }
            int crow = figure.getrow();
            int ccol = figure.getcol();
            f[crow][ccol] = null;
            figure.setPosition(drow, dcol);
            f[drow-1][dcol-1] = figure;
        }


        public void displayBoard() {
            System.out.println("Board:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                Figure figure = f[i][j];
                if (figure != null) {
                    System.out.print(figure.getName() + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    public Figure getFposition(int nrow, int ncol) {
        if (nrow < 0 || nrow >= size || ncol < 0 || ncol >= size) {
            return null;
        }

        return f[nrow][ncol];
    }
    public int getSize(){
        return size;
    }
}
