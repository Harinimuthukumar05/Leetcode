class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,-1);
        int maxLen=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)sum+=-1;
            else sum+=1;
            if(m.containsKey(sum)){
                maxLen=Math.max(maxLen,i-m.get(sum));
            }
            else{
                m.put(sum,i);
            }
        }
        return maxLen;
    }
}