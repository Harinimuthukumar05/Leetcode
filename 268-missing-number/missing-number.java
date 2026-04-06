class Solution {
    public int missingNumber(int[] nums) {
        int si=nums.length;
        int n=(si*(si+1))/2;
        for(int i=0;i<si;i++){
            n=n-nums[i];
        }   
        return n;
    }
}