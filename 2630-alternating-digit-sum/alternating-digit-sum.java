class Solution {
    public int alternateDigitSum(int n) {
        int digcount=(int)Math.log10(n)+1;
        int sum=0;
        if((digcount&1)==1){
            int sign=1;
            int digit=0;
            while(n>0){
                digit=n%10;
                n/=10;
                int temp=digit*sign;
                sum+=temp;
                sign*=-1;
            }
        }
        else{
            int sign=-1;
            int digit=0;
            while(n>0){
                digit=n%10;
                n/=10;
                int temp=digit*sign;
                sum+=temp;
                sign*=-1;
            }
        }
        return sum;
    }
}