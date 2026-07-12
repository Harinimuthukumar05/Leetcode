class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] copy=arr.clone();
        int[] ans=new int[n];
        Arrays.sort(copy);
        Map<Integer,Integer> hm=new HashMap<>();
        int rank=1;
        for(int i:copy){
            if(!(hm.containsKey(i))){
                hm.put(i,rank);
                rank++;
            }
        }
        for(int i=0;i<n;i++){
            ans[i]=hm.get(arr[i]);
        }
        return ans;
    }
}