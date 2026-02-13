class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=Arrays.stream(costs).max().getAsInt();
        int[] freq=new int[max+1];
        int count=0;
        for(int num:costs){
            freq[num]++;
        }
        int index=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                costs[index++]=i;
                freq[i]--;
            }
        }
        for(int i:costs){
            if(i<=coins){
                count++;
                coins-=i;
            }
        }
        return count;
    }
}