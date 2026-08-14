class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;
       int max=Integer.MIN_VALUE;
       int ans=-1;
       for(int i:piles){
        max=Math.max(i,max);
       } 
       int high=max;
       while(low<=high){
        int mid=low+(high-low)/2;
        long hours=calHours(mid,piles);
        if(hours<=h){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       } 
       return ans;
    }
    public long calHours(int mid,int[] piles){
        long hr=0;
        for(int i:piles){
            hr+=(int)(Math.ceil((double)i/mid));
        }
        return hr;
    }
}