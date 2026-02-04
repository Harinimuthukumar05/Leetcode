class Solution {
    public boolean judgeSquareSum(int c) {
        long s=(long)Math.sqrt(c);
        long i=0;
        long j=s;
        while(i<=j){
            if((i*i+j*j)==c)return true;
            else if(i*i+j*j>c){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}