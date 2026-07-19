package org.example;
//AMAZON ASKED LEETCODE PROBLEM :: SUDOKU VALIDATOR
//THERE ATE THREE CONDITION THERE :
//1. No Duplicates in one Row
//2. No Duplicates in one Column
//3. No Duplicates in 3x3 Sub Cell
public class SudokuValidator {

    public static boolean isValidSudoku(char[][] array) {

//HERE WE CANT ITERATE THE ENTIRE THE SUDOKU SO HERE WE ADDED UP THE OE LOOP IN OTHER FUNC FOR THE ITERATION
//SO FOR THAT ITERATION WE CREATE THE ANOTHER NEW FUNC NAMED AS THE ISVALIDATE()
        for(int i=0;i<array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                if (!isValidate(i,j,array)) {
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean isValidate(int row, int col , char [][] arrays)
    {
        if(arrays[row][col] == '.'){return true;} // here Check the blank cell if cell is blank then Continue not check
        for(int i =0; i< arrays.length;i++)
        {
            if( col != i && arrays[row][col] == arrays[row][i]){ return false;} // Column Checking the Duplicates
            if( row != i && arrays[row][col] == arrays[i][col]){return false;} // Row Checking the Duplicates
            int subRow = 3 * (row / 3) + i / 3;
            int subCol = 3 * (col / 3) + i % 3;
            if ((subRow != row || subCol != col) && arrays[subRow][subCol] == arrays[row][col]) { // here Check the Duplicates in 3x3 sub part
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] array = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                  {'7','.','.','.','2','.','.','.','6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        boolean res = isValidSudoku(array);
        System.out.println(res);

    }
}
