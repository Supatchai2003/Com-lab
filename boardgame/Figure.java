package boardgame;

public class Figure {
    private String name;
    private String color;
    private int row;
    private int col;
    
    public Figure(String name, String color, int row, int col) {
        this.name = name;
        this.color = color;
        this.row = row-1;
        this.col = col-1;
    }
    public boolean freeMove(int drow, int dcol, Board board) {
        dcol -=1; 
        drow -=1;
        if (drow < 0 || drow >= board.getSize() || dcol < 0 || dcol >= board.getSize()) {
            System.out.println("ไม่สามารถย้ายที่ได้ เนื่องจากที่ต้องการย้ายที่นั้นไม่มีพื้นที่อยู่");
            return false;
        }
        Figure fd = board.getFposition(drow, dcol);
        if (fd != null && fd.getColor()==color) {
            System.out.println("ย้ายไปพื้นที่นี้ไม่ได้ เพราะ มีสีเดียวกันอยู่");
            return false;
        }
        return true;
    }
    
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getrow() {
        return row;
    }

    public int getcol() {
        return col;
    }
    public void setPosition(int row, int col) {
        this.row = row-1;
        this.col = col-1;
    }

}
