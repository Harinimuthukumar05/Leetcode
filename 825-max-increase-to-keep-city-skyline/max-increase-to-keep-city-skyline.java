class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] rmax=new int[n];
        int[] cmax=new int[n];
        for(int i=0;i<n;i++){
            int row=Integer.MIN_VALUE;
            int col=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if(grid[i][j]>row){
                    row=grid[i][j];
                }
                if(grid[j][i]>col){
                    col=grid[j][i];
                }
                rmax[i]=row;
                cmax[i]=col;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=Math.min(rmax[i],cmax[j])-grid[i][j];
            }
        }
        return sum;
    }
}