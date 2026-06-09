class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int len=0;
        int minLen=Integer.MAX_VALUE;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                len=r-l+1;
                minLen=Math.min(len,minLen);
                sum-=nums[l];
                l++;
            }
        }
        
        return minLen!=Integer.MAX_VALUE?minLen:0;
    }
}