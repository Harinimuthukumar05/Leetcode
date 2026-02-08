class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        Queue<Integer> R=new LinkedList<>();
        Queue<Integer> D=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                R.offer(i);
            }
            else{
                D.offer(i);
            }
        }
        while(!R.isEmpty() && !D.isEmpty()){
            int r=R.poll();
            int d=D.poll();
            if(r<d)R.offer(r+n);
            else D.offer(d+n);
        }
        if(R.isEmpty()){
            return "Dire";
        }
        return "Radiant";
    }
}