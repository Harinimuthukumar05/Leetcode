class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int num=quantities.length;
        int low=1;
        int max=Integer.MIN_VALUE;
        for(int i:quantities){
            max=Math.max(i,max);
        }
        int ans=-1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(midIsPossible(mid,quantities,n)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean midIsPossible(int mid,int[] quantities,int n){
        int usedStore=0;
        for(int i=0;i<quantities.length;i++){
            usedStore+=Math.ceil((double)quantities[i]/mid);
        }
        return usedStore<=n;
    }
}