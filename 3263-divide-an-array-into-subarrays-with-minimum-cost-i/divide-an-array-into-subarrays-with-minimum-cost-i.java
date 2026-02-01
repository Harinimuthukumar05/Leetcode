class Solution {
    public int minimumCost(int[] nums) {
        int first=nums[0];
        int ans=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int j=1;j<nums.length;j++){
            if(j>=2){
                ans=Math.min(ans,first+second+nums[j]);
            }
            second=Math.min(second,nums[j]);
        }
        return ans;
    }
}