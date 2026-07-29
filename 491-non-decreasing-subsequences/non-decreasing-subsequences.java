class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> temp=new ArrayList<>();
        subSeq(0,set,temp,nums);
        List<List<Integer>> res=new ArrayList<>(set);
        return res;
    }
    public void subSeq(int i,Set<List<Integer>> set,List<Integer> temp,int[] nums){
        if(i==nums.length)return;
        //pick
        if(temp.size()==0 || nums[i]>=temp.get(temp.size()-1)){
        temp.add(nums[i]);
        if(temp.size()>1){
            set.add(new ArrayList(temp));
        }
        subSeq(i+1,set,temp,nums);
        temp.remove(temp.size()-1);
        }
        //not pick
        subSeq(i+1,set,temp,nums);
    }
}