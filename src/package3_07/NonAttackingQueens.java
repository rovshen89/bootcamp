package package3_07;

public class NonAttackingQueens{
    final int n = 8;

    public void printBoard(char board[][]){
        String result = "";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Method to check if a queen is safe in a given position
    public boolean util(char board[][], int row, int col){
        //check the row on left side
        for (int i = 0; i < col; i++){
            if (board[row][i] == 'Q'){
                return false;
            }
        }

        //check the upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j-- ){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        //check the lower diagonal on the left side
        for (int i = 0, j = col; i < n && j >=0; i++, j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    //Recursive utility method to solve N Queen problems
    public boolean solveNQueensUtil(char board[][], int col){
        //Base case: if all queens are placed, return true
        if (col >= n)return true;


        for (int i = 0; i < n; i++){
            if (util(board, i, col)){
                board[i][col] = 'Q';
                if (solveNQueensUtil(board, col +1) == true){
                    return true;
                }
                board[i][col] = 'O';
            }
        }
        return false;
    }

    //main method
    public static void main(String[] args) {
        char[][] board = {{'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'} };

        NonAttackingQueens problem = new NonAttackingQueens();
        if (!problem.solveNQueensUtil(board, 2)){
            System.out.println("No Solution");
        }
        problem.printBoard(board);
    }
}