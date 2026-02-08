class Solution {
    public int alternatingSum(int[] nums) {
        int sign=1;
        int sum=0;
        for(int num:nums){
            sum+=num*sign;
            sign*=-1;
        }
        return sum;
    }
}