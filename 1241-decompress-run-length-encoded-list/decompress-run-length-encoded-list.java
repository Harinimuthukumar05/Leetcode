class Solution {
    public int[] decompressRLElist(int[] nums) {
        int freq=0;
        int count=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                freq=nums[i];
            }
            else{
                for(int j=0;j<freq;j++){
                    l.add(nums[i]);
                }
            }
        }
        
        int[] ans=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}