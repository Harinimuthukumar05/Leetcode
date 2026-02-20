class Solution {
    public void reverse(int start,int end,int[] nums){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        int calc=len-k;
        reverse(0,calc-1,nums);
        reverse(calc,len-1,nums);
        reverse(0,len-1,nums);
    }
}