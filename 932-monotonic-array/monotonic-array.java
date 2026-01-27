class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean asc=true;
        boolean desc=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])asc=false;
            if(nums[i]<nums[i+1])desc=false;
        }
        if(!asc && !desc){
            return false;
        }
        return asc?asc:desc;
    }
}