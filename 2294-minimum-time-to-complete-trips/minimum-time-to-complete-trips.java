class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long n=time.length;
        long max=Long.MIN_VALUE;
        for(long i:time){
            max=Math.max(i,max);
        }
        long low=1;
        long high=max*totalTrips;
        long ans=Long.MAX_VALUE;
        while(low<=high){
            long mid=low+(high-low)/2;
            long total=countTrips(time,mid);
            if(total>=totalTrips){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public long countTrips(int[] time,long mid){
        long sum=0;
        for(int i=0;i<time.length;i++){
            sum+=mid/time[i];
        }
        return sum;
    }
}