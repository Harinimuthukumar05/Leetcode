class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==1)sum+=entry.getKey();
        }
        return sum;
    }
}