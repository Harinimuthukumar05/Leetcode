class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> num=new ArrayList<>();
        for(int i=1;i<=n;i++){
            num.add(i);
        }
        return seq(num,k-1);
    }
    private String seq(List<Integer> num,int k){
        if(num.size()==0)return "";
        int n=num.size();
        int fact=factorial(n-1);
        int idx=k/fact;
        int selected=num.get(idx);
        num.remove(idx);
        return selected+seq(num,k%fact);
    }
    private int factorial(int n){
        if(n==0)return 1;
        return n*factorial(n-1);
    }
}