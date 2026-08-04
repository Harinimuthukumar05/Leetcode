class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int[] pref=new int[n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int totalSum=pref[n-1];
        for(int i=0;i<n;i++){
            int leftSum=(i==0)?0:pref[i-1];
            int rightSum=totalSum-pref[i];
            res[i]=Math.abs(leftSum-rightSum);
        }
        return res;
    }
}