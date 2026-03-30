class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        long sum=0;
        long maxSum=0;
        Set<Integer> s=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(s.contains(nums[right])){
                s.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            s.add(nums[right]);
            sum+=nums[right];
            if(right-left+1>k){
                s.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            if(right-left+1==k){
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}