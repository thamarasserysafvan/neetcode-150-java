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
                boxes[boxIdx]=boxes[boxIdx]|bitNum;
            }
        }
        return true;
    }
}