class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            fast=getNext(getNext(fast));
            slow=getNext(slow);
        }
        while(slow!=fast);

        return slow==1;
    }
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}