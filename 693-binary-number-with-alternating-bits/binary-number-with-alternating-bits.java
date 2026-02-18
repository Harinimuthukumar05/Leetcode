class Solution {
    public boolean hasAlternatingBits(int n) {
        int digcount=0;
        int temp=n;
        while(temp>0){
            digcount++;
            temp=temp>>1;
        }
        int val=(n>>1)^n;
        int setbit=0;
        while(val>0){
            if((val&1)==1){
            setbit++;
            }
            val=(val>>1);
        }
        return setbit==digcount;
    }
}