class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(num,max);
        }
        int size=max-min+1;
        for(int i=0;i<size;i++){
            ans.add(min++);
        }
        for(int num:nums){
            if(ans.contains(num)){
                ans.remove(Integer.valueOf(num));
            }
        }
        return ans;
    }
}