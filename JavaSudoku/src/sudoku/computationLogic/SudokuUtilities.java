package sudoku.computationLogic;

import sudoku.problemDomain.SudokuGame;

public class SudokuUtilities {
    public static void copySudokuArrayValues(int[][] oldArray, int [][] newArray){
        for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++) {
            System.arraycopy(oldArray[xIndex], 0, newArray[xIndex], 0, SudokuGame.GRID_BOUNDARY);
        }
    }

    public static int[][] copyToNewArray(int[][] oldArray){
        int[][] newArray = new int[SudokuGame.GRID_BOUNDARY][SudokuGame.GRID_BOUNDARY];

        for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++) {
            System.arraycopy(oldArray[xIndex], 0, newArray[xIndex], 0, SudokuGame.GRID_BOUNDARY);
        }
        return newArray;
    }

}
