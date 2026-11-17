class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean [][] row=new boolean [9][9];
        boolean [][] cols=new boolean [9][9];
        boolean [][] boxes=new boolean [9][9];
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char current=board[r][c];
                if(current=='.'){
                    continue;
                }
                int digiIndx= current - '1';
                int boxIdx=(r/3)*3+(c/3);
           
                if(row[r][digiIndx]||cols[c][digiIndx]||boxes[boxIdx][digiIndx]){
                    return false;
                }
                row[r][digiIndx]=true;
                cols[c][digiIndx]=true;
                boxes[boxIdx][digiIndx]=true;
            }
        }
        return true;
    }
}