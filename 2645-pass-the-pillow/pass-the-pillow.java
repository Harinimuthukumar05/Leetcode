class Solution {
    public int passThePillow(int n, int time) {
        int fullRounds=time/(n-1);
        int extrarounds=time%(n-1);
        if(fullRounds%2==0) return extrarounds+1;
        else return n-extrarounds;
    }
}