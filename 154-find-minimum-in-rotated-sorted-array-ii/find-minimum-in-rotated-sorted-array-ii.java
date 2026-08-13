class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<nums[high]){
                high=mid;
            }
            else if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                //nums[high]==nums[mid] then all the right half is duplicates
                high--;
            }
        }
        return nums[low];
    }
}