class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(i,j,0,board,word)==true)return true;
                }
            }
        }
        return false;
    }
    public boolean search(int row,int col,int k,char[][] board,String word){
        if(k==word.length())return true;
        if(row<0 || col<0 || row==board.length || col==board[0].length || board[row][col]!=word.charAt(k)){
            return false;
        }

        char ch=board[row][col];
        board[row][col]='*';

        boolean up=search(row-1,col,k+1,board,word);
        boolean down=search(row+1,col,k+1,board,word);
        boolean right=search(row,col+1,k+1,board,word);
        boolean left=search(row,col-1,k+1,board,word);

        board[row][col]=ch;

        return up||down|| right || left;
    }
}