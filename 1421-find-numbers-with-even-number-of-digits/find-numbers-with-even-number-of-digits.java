class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(evenCount(num)){
                count++;
            }
        }
        return count;
    }
    public boolean evenCount(int num){
        int digits = (int) (Math.log10(num) + 1);
        if(digits%2==0)return true;
        return false;
    }
}