class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        List<Integer> temp=new ArrayList<>();
        return bSubset(0,temp,nums,k)-1;
        
    }
    public int bSubset(int i,List<Integer> temp,int[] nums,int k){
        if(i==nums.length)return 1;

        //pick
        int pick=0;
        if(!temp.contains(nums[i]+k)&& (!temp.contains(nums[i]-k))){
            temp.add(nums[i]);
            pick=bSubset(i+1,temp,nums,k);
            temp.remove(temp.size()-1);
        }

        //not pick
        int notPick=bSubset(i+1,temp,nums,k);
        return pick+notPick;
    }
}