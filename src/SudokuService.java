public class SudokuService {
    public boolean checkRow(Sudoku sudoku, int num, int row) {
        for(int i = 0; i < sudoku.getGRID_SIZE(); i++) {
            if(sudoku.getGRID()[row][i] == num) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColumn(Sudoku sudoku, int num, int column) {
        for(int i = 0; i < sudoku.getGRID_SIZE(); i++) {
            if(sudoku.getGRID()[column][i] == num) {
                return true;
            }
        }
        return false;
    }

    public boolean checkBox(Sudoku sudoku, int num, int row, int column) {
        int localboxRow = row - row % 3;
        int localboxColumn = column - column % 3;
        for(int i = localboxRow; i < localboxRow + 3; i++) {
            for(int j = localboxColumn; i < localboxColumn + 3; i ++) {
                if(sudoku.getGRID()[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean esValido(Sudoku sudoku, int num, int row, int column){
        return !checkRow(sudoku, num, row) &&
                !checkColumn(sudoku, num, column) &&
                !checkBox(sudoku, num, row, column);
    }

    public boolean resolver(Sudoku sudoku){
        for(int i = 0; i < sudoku.getGRID_SIZE(); i++){
            for(int j = 0; j < sudoku.getGRID_SIZE(); j++) {
                if(sudoku.getGRID()[i][j] == 0) {
                    for(int numero = 1; numero <= sudoku.getGRID_SIZE(); numero++) {
                        if(esValido(sudoku, numero, i, j)){
                            sudoku.getGRID()[i][j] = numero;

                            if(resolver(sudoku)) {
                                return true;
                            } else {
                                sudoku.getGRID()[i][j] = 0;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
