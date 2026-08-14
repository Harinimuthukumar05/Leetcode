class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int product=1;
            int copy=n;
            while(copy>0){
                product*=copy%10;
                copy/=10;
            }
            if(product%t==0)return n;
            n++;
        }
    }
}