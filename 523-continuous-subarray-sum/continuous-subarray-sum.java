class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int sum=0;
        int rem=0;
        m.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem=((sum%k)+k)%k;
            if(m.containsKey(rem)){
                if(i-m.get(rem)>=2){
                    return true;
                }
            }
            else{
                m.put(rem,i);
            }
        }
        return false;
    }
}