class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c!='.'){
                    if(!s.add(c+" is in"+i)|| !s.add(c+"is in"+j) || !s.add(c+" is in "+i/3+"-"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}