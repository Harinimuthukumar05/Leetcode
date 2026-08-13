class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1;
        int high=10000000;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            double no_of_hr=calHr(mid,dist);
            if(no_of_hr<=hour){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public double calHr(int mid,int[] dist){
        double hr=0;
        for(int i=0;i<dist.length-1;i++){
            hr+=Math.ceil((double)dist[i]/mid);
        }
        hr+=(double)dist[dist.length-1]/mid;
        return hr;
    }
}