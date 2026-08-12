class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        //dp[i][j]->length of LIS startinf from i index when the last element picked was at index j
        int[][] dp=new int[n][n-1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return lis(0,-1,nums,dp);
    }
    public int lis(int i,int prev,int[] nums,int[][] dp){
        if(i==nums.length)return 0;
        if(prev!=-1 && dp[i][prev]!=-1)return dp[i][prev];
        int pick=0;
        if(prev==-1 || nums[i]>nums[prev]){
            pick=1+lis(i+1,i,nums,dp);
        }

        int notPick=lis(i+1,prev,nums,dp);
        if(prev!=-1)
        return dp[i][prev]=Math.max(pick,notPick);
        else
        return Math.max(pick,notPick);
    }
}