class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            int sum=currsum+nums[i];
            if(nums[i]>sum){
                currsum=nums[i];
            }
            else{
                currsum=sum;
            }
            max=Math.max(currsum,max);
        }
        return max;
    }
}