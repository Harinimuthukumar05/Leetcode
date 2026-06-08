class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x=Math.abs(nums[i]);
            if(nums[x-1]>0){
                nums[x-1]*=-1;
            }
            else if(nums[x-1]<0){
                dup.add(Math.abs(nums[i]));
            }
        }
        return dup;
    }
}