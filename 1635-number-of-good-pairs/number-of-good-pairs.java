class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.values()){
            int num=i-1;
            count+=(num*(num+1))/2;
        }
        return count;
    }
}