class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int prev1=nums[0];
        int prev2=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int steal=nums[i]+prev1;
            int notSteal=prev2;
            int curr=Math.max(steal,notSteal);
            prev1=prev2;
            prev2=curr;
        }
        return prev2;
    }
}