class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] pref=new int[n];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int totalSum=pref[nums.length-1];
        for(int i=0;i<n;i++){
            int leftSum=(i==0)?0:pref[i-1];
            int rightSum=totalSum-pref[i];
            if(leftSum==rightSum)return i;
        }
        return -1;
    }
}