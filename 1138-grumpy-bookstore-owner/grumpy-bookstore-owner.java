class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int satisfied=0;
        int extra=0;
        int maxextra=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];
            }
        }
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
        }
        maxextra=Math.max(extra,maxextra);
        for(int i=minutes;i<n;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
            if(grumpy[i-minutes]==1){
                extra-=customers[i-minutes];
            }
            maxextra=Math.max(extra,maxextra);
        }
        return satisfied+maxextra;
    }
}