class Solution {
    public int gcdOfOddEvenSums(int n) {
        //because oddsum=n^2,evensum=n(n+1) gcd(n^2,n(n+1))=n*gcd(n,n+1) here gcd(2 consecutive numbers)=1
        //therefore n*1=n
        return n;
    }
}