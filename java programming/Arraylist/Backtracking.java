package Arraylist;
// public class Backtracking {
//     public static void printpermutation(String str, int idx, String perm) {
//         if (str.length() == 0) {
//             System.out.println(perm);
//             return;
//         }

//         for (int i = 0; i < str.length(); i++) {
//             char currchar = str.charAt(i);
//             String newString = str.substring(0, i) + str.substring(i+1);
//             printpermutation(newString, idx + 1, perm + currchar);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "ABC";
//         printpermutation(str, 0, " ");
//     }
// }

// public class Backtracking {

//     public static void changeArr(int arr[], int i, int val) {
//         // basecase
//         if (i == arr.length) {
//             printArr(arr);
//             return;
//         }
//         // recurssion
//         arr[i] = val;
//         changeArr(arr, i + 1, val + 1);
//         arr[i] = arr[i] - 2;
//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = new int[5];
//         changeArr(arr, 0, 1);
//         printArr(arr);
//     }
// }

// public class Backtracking {

//     public static void findSubset(String str, String ans, int i) {
//         // basecase
//         if (i == str.length()) {
//            if (ans.length()==0) {
//             System.out.println("null");
//            }
//            else{
//             System.out.println(ans);
//            }
//             return;
//         }
//         // yes wali choice
//         findSubset(str, ans + str.charAt(i), i + 1);
//         // no wali choice
//         findSubset(str, ans, i + 1);
//     }

//     public static void main(String[] args) {
//         String str = "ABC";
//         findSubset(str, "", 0);
//     }
// }


public class Backtracking {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        // Column check
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;  // If found in the column, it's not safe
            }
        }

        // Row check
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;  // If found in the row, it's not safe
            }
        }

        // Grid check (3x3 subgrid)
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;  // If found in the subgrid, it's not safe
                }
            }
        }

        return true; // If passed all checks, digit is safe to place
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // Base case: If we reach row 9, the sudoku is solved
        if (row == 9) {
            return true;
        }

        // Calculate next cell position
        int nextRow = row, nextCol = col + 1;
        if (col == 8) { // If end of row, move to next row
            nextRow = row + 1;
            nextCol = 0;
        }

        // If the cell is already filled, move to the next cell
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try placing digits 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit; // Place the digit

                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true; // If solved, return true
                }

                sudoku[row][col] = 0; // Backtrack if placing this digit didn't lead to a solution
            }
        }
        
        return false; // No valid number found, so return false
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
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

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solved Sudoku:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
