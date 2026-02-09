import java.util.*;

class Solution {

    List<List<String>> result = new ArrayList<>();
    char[][] board;

    public List<List<String>> solveNQueens(int n) {
        board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0, n);
        return result;
    }

    private void backtrack(int row, int n) {
        // base case: all rows filled
        if (row == n) {
            result.add(constructBoard());
            return;
        }

        // try placing queen in each column
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, n)) {
                board[row][col] = 'Q';   // place queen
                backtrack(row + 1, n);  // move to next row
                board[row][col] = '.';  // backtrack
            }
        }
    }

    private boolean isSafe(int row, int col, int n) {

        // 1️⃣ Check same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // 2️⃣ Check upper-left diagonal
        for (int i = row - 1, j = col - 1; 
             i >= 0 && j >= 0; 
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // 3️⃣ Check upper-right diagonal
        for (int i = row - 1, j = col + 1; 
             i >= 0 && j < n; 
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true; // safe position
    }

    private List<String> constructBoard() {
        List<String> boardConfig = new ArrayList<>();
        for (char[] row : board) {
            boardConfig.add(new String(row));
        }
        return boardConfig;
    }
}

