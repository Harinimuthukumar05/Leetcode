class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        if(totalSum%2==1)return false;
        int target=totalSum/2;
        Boolean[][] dp=new Boolean[n+1][target+1];
        return part(n-1,nums,target,dp);
    }
    public boolean part(int i,int[] arr,int sum,Boolean[][] dp){
        if(sum==0)return true;
        if(i==0){
            if(arr[i]==0 && sum==0)return true;
            else if(arr[i]==sum || sum==0)return true;
            else return false;
        }
        if(dp[i][sum]!=null)return dp[i][sum];
        boolean pick=false;
        if(arr[i]<=sum){
            pick=part(i-1,arr,sum-arr[i],dp);
        }
        boolean not_pick=part(i-1,arr,sum,dp);
        return dp[i][sum]=pick || not_pick;
    }
}