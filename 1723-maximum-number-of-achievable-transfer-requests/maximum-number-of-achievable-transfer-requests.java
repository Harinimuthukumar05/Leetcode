class Solution {
    int ans=0;
    public int maximumRequests(int n, int[][] requests) {
        int[] houses=new int[n];
        maxRequests(0,0,houses,requests);
        return ans;
    }
    public void maxRequests(int i,int count,int[] house,int[][] req){
        //base
        if(i==req.length){
            for(int num:house){
                if(num!=0)return;
            }
            ans=Math.max(ans,count);
            return;
        }
        //pick
        int from=req[i][0];
        int to=req[i][1];
        house[from]--;
        house[to]++;
        maxRequests(i+1,count+1,house,req);
        house[from]++;
        house[to]--;

        maxRequests(i+1,count,house,req);
    }
}