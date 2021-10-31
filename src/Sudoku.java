public class Sudoku {
    private final int GRID_SIZE = 9;
    private int[][] GRID = new int [GRID_SIZE][GRID_SIZE];

    public Sudoku() {
    }

    public int getGRID_SIZE() {
        return GRID_SIZE;
    }

    public int[][] getGRID() {
        return GRID;
    }

    public void setGRID(int[][] GRID) {
        this.GRID = GRID;
    }
}
