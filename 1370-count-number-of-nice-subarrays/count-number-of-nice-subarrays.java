class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int even=0;
        int odd=0;
        int sub=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2==1){
                odd++;
                even=0;
            }
            while(odd>k){
                if(nums[left]%2==1){
                    odd--;
                }
                left++;
            }
            while(nums[left]%2==0 && odd==k){
                even++;
                left++;
            }
            if(odd==k){
                sub+=even+1;
            }
        }
        return sub;
    }
}