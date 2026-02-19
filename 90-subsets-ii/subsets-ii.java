class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0, new ArrayList<>(), nums);
        return res;
    }
    void backtrack(int index, List<Integer> temp, int[] nums) {
        res.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {
            if(i>index && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);        
            backtrack(i + 1, temp, nums); 
            temp.remove(temp.size() - 1);
        }
    }
}