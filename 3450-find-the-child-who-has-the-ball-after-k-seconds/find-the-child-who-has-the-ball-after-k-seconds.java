class Solution {
    public int numberOfChild(int n, int k) {
       int fullrounds=k/(n-1);
       int extrarounds=k%(n-1);
       if(fullrounds%2==0)return extrarounds;
       else return n-extrarounds-1; 
    }
}