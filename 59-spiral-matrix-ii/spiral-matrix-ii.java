class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums1=new int[n][n];
        int lc=0,rc=n-1,tr=0,br=n-1;
        int val=1;
        while(val<=n*n){
            for(int i=lc;i<=rc && val<=n*n;i++){
                nums1[tr][i]=val++;
            }
            for(int i=tr+1;i<br && val<=n*n;i++){
                nums1[i][rc]=val++;
            }
            for(int i=rc;i>=lc && val<=n*n;i--){
                nums1[br][i]=val++;
            }
            for(int i=br-1;i>tr && val<=n*n;i--){
                nums1[i][lc]=val++;
            }
            tr++;
            br--;
            rc--;
            lc++;
        }
        return nums1;
    }
}