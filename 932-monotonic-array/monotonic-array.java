class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean asc=true;
        boolean desc=true;
        int n=nums.length;
        if(n==1)return true;
        for(int i=0;i<nums.length-1;i++){
            if(!desc &&!asc)return false;
            if(nums[i]>nums[i+1])asc=false;
            if(nums[i]<nums[i+1])desc=false;
        }
        return asc||desc;
    }
}