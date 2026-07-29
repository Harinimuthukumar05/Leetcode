class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        comSum(0,0,res,temp,target,candidates);
        return res;
    }
    public void comSum(int i,int currSum,List<List<Integer>> res,List<Integer> temp,int target,int[] arr){
        if(currSum==target){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(i==arr.length || currSum>target)return;


        //pick
        temp.add(arr[i]);
        comSum(i,currSum+arr[i],res,temp,target,arr);
        temp.remove(temp.size()-1);

        //not pick
        comSum(i+1,currSum,res,temp,target,arr);
    }
}