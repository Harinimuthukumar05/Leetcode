class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> hm=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int fcount=0;
        for(char c:tasks){
            hm.put(c,hm.getOrDefault(c,0)+1);
            max=Math.max(hm.get(c),max);
        }
        for(int i:hm.values()){
            if(i==max){
                fcount++;
            }
        }
        int ans=(max-1)*(n+1)+fcount;
        return ans<tasks.length?tasks.length:ans;
    }
}