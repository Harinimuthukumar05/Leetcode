class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int count=0;
        int copy=n;
        while(copy>0){
            count++;
            copy=copy>>1;
        }
        int num=1;
        for(int i=0;i<count;i++){
            n=n^num;
            num=num<<1;
        }
        return n;
    }
}