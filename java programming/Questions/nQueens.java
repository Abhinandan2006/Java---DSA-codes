package Questions;
public class nQueens {
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true; 
    }

    public static boolean queens(char board[][], int row) { // changing void to boolean for the modification because we want to print only one solution ll
        // base
        if (row == board.length) {
            printboard(board);
            count++;
            return true;
        }
        // for column
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(queens(board, row + 1)){
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;
    }

    public static void printboard(char board[][]) {
        System.out.println("----chess board----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if (queens(board, 0)) {
            System.out.println("solution is possible");
        }else{
            System.out.println("solution is not possible");
        }
        System.out.println("total ways = "+count);
    }
}

// public class nQueens {
//     public static int gridWays(int i, int j , int n , int m ){
//         if (i==n-1&&j==m-1) {// base casell
//             return 1;
//         }else if(i==n || j==m){// boundry condition
//             return 0;
//         }
//         int w1 = gridWays(i+1, j, n, m);
//         int w2 = gridWays(i, j+1, n, m);
//         return w1+w2;
//     }
//     public static void main(String[] args) {
//         int n=3,m=3;
//         System.out.println(gridWays(0, 0, n, m));
//     }
// }

// public class nQueens {
//     public static boolean isSafe(int sudoku[][], int row, int col, int dig) {
//         for (int i = 0; i <= 8; i++) {
//             if (sudoku[i][col] == dig) {
//                 return false;
//             }
//         }
//         for (int j = 0; j <= 8; j++) {
//             if (sudoku[row][j] == dig) {
//                 return false;
//             }
//         }

//         int sr = (row / 3) * 3;
//         int sc = (col / 3) * 3;

//         for (int i = sr; i < sr + 3; i++) {
//             for (int j = sc; j < sc + 3; j++) {
//                 if (sudoku[i][j] == dig) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     public static boolean sudokuSolver(int sudoku[][], int row, int col) {

//         if (row == 9 && col == 0) {
//             return true;
//         } 

//         int nextRow = row, nextCol = col + 1;
//         if (col + 1 == 9) {
//             nextRow = row + 1;
//             nextCol = 0;
//         }

//         if (sudoku[row][col] != 0) {
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }
        
//         for (int dig = 1; dig <= 9; dig++) {
//             if (isSafe(sudoku, row, col, dig)) {
//                 sudoku[row][col] = dig;
//                 if (sudokuSolver(sudoku, nextRow, nextCol)) {
//                     return true;
//                 }
//                 sudoku[row][col] = 0;
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {

//     }
// }