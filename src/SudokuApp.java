public class SudokuApp {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        SudokuService SV = new SudokuService();
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        sudoku.setGRID(board);
        printBoard(sudoku);

        if (SV.resolver(sudoku)) {
            System.out.println("Solved successfully!");
        }
        else {
            System.out.println("Unsolvable board :(");
        }

        printBoard(sudoku);
    }



    private static void printBoard(Sudoku sudoku) {
        for (int row = 0; row < sudoku.getGRID_SIZE(); row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int column = 0; column < sudoku.getGRID_SIZE(); column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print("|");
                }
                System.out.print(sudoku.getGRID()[row][column]);
            }
            System.out.println();
        }
    }
}
