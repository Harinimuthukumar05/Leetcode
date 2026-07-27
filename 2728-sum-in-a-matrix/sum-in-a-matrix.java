class Solution {
    public int matrixSum(int[][] nums) {
        int rows=nums.length;
        int cols=nums[0].length;
        for(int i=0;i<rows;i++){
            Arrays.sort(nums[i]);
        }
        int score=0;
        for(int j=cols-1;j>=0;j--){
            int max=0;
            for(int i=0;i<rows;i++){
                max=Math.max(max,nums[i][j]);
            }
            score+=max;
        }
        return score;
    }
}