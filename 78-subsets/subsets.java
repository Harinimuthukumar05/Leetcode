class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        backtrack(0,new ArrayList<>(),nums);
        return ans;
    }
    public void backtrack(int index,List<Integer> temp,int[] nums){
        ans.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(i+1,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}