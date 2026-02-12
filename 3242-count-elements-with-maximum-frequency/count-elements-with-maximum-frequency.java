class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int i:m.values()){
            max=Math.max(i,max);
        }
        for(int i:m.values()){
            if(i==max){
                sum+=i;
            }
        }
        return sum;
    }
}