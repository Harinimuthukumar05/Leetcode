class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        boolean[] seen=new boolean[50+1];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(seen[nums[i]]){
                ans^=nums[i];
            }
            else{
                seen[nums[i]]=true;
            }
        } 
        return ans;
    }
}