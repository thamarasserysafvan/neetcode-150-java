class Solution {
    public boolean isValidSudoku(char[][] board) {
        int [] row=new int [9];
        int [] cols=new int [9];
        int [] boxes=new int [9];
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                int digiIndx= board[r][c] - '1';
                int bitNum=1<<digiIndx;
                int boxIdx=(r/3)*3+(c/3);
           
                if((row[r]&bitNum)!=0||(cols[c]&bitNum)!=0||(boxes[boxIdx]&bitNum)!=0){
                    return false;
                }
                row[r]|=bitNum;
                cols[c]|=bitNum;
                boxes[boxIdx]|=bitNum;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidSudoku solver = new ValidSudoku();
        char[][] validBoard = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(solver.isValidSudoku(validBoard)); // Expected: true

        // Introduce duplicate '8' in top-left box
        validBoard[0][0] = '8';
        System.out.println(solver.isValidSudoku(validBoard)); // Expected: false
    }

}


