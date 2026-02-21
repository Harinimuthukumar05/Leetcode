class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        int primeMask=(1<<2 | 1<<3 | 1<<5 | 1<<7 |1<<11 | 1<<13 | 1<<17 |1<<19);
        for(int i=left;i<=right;i++){
            int bits=bitcount(i);
            if((primeMask & (1<<bits))!=0){
                count++;
            }
        }
        return count;
    }
    public int bitcount(int n){
        int count=0;
        int temp=n;
        while(temp>0){
            if((temp&1)==1){
                count++;
            }
            temp=temp>>1;
        }
        return count;
    }
}