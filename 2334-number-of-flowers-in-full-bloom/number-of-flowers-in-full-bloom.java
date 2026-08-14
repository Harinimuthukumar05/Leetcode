class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n=people.length;
        int[] see=new int[n];
        int[] s=new int[flowers.length];
        int[] e=new int[flowers.length];
        for(int i=0;i<flowers.length;i++){
            s[i]=flowers[i][0];
            e[i]=flowers[i][1];
        }
        Arrays.sort(s);
        Arrays.sort(e);
        for(int i=0;i<n;i++){
            int x=firstGreater(s,people[i]);
            int y=firstGreaterOrEqual(e,people[i]);
            see[i]=x-y;
        }
        return see;
    }
    public int firstGreater(int[] s,int person){
        int low=0;
        int high=s.length-1;
        int ans=s.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(s[mid]>person){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int firstGreaterOrEqual(int[] e,int person){
        int low=0;
        int high=e.length-1;
        int ans=e.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(e[mid]>=person){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}