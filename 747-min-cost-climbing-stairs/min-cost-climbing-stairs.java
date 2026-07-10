class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(climb(n-1,cost,dp),climb(n-2,cost,dp));
    }
    public int climb(int i,int[] cost,int[] dp){
        if(i==0)return cost[i];
        if(i==1)return cost[i];
        if(dp[i]!=-1)return dp[i];
        int step1=cost[i]+climb(i-1,cost,dp);
        int step2=cost[i]+climb(i-2,cost,dp);
        return dp[i]=Math.min(step1,step2);
    }
}