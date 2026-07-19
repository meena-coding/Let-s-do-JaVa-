/*Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.

example: 1

Input: board =
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
Example 2:

Input: board =
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.


Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit 1-9 or '.'.

 */


import java.util.HashSet;

class validSudoku {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {

            HashSet<Character> col = new HashSet<>();
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> box = new HashSet<>();

            //starting position of current 3x3 box

            int startRow = (i / 3) * 3;
            int startCol = (i % 3) * 3;

            //checking for row and col now

            for (int j = 0; j < 9; j++) {

                //check for row

                char rowValue = board[i][j];
                if (rowValue != '.') {
                    if (row.contains(rowValue))
                        return false;

                    row.add(rowValue);
                }

                //checking for column

                char colValue = board[j][i];

                if (colValue != '.') {
                    if (col.contains(colValue))
                        return false;

                    col.add(colValue);
                }
            }

            //check for 3x3 box
            for (int r = startRow; r < startRow + 3; r++) {

                for (int c = startCol; c < startCol + 3; c++) {

                    char value = board[r][c];

                    if (value != '.') {
                        if (box.contains(value))
                            return false;

                        box.add(value);
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        validSudoku answer = new validSudoku();

        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(answer.isValidSudoku(board));

    }

}
