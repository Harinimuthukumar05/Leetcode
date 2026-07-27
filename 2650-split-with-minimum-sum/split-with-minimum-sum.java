class Solution {
    public int splitNum(int num) {
        ArrayList<Integer> a=new ArrayList<>();
        int num1=0;
        int num2=0;
        while(num>0){
            a.add(num%10);
            num/=10;
        }
        Collections.sort(a);
        for(int i=0;i<a.size();i++){
            if(i%2==0){
                num2=num2*10+a.get(i);
            }
            else{
                num1=num1*10+a.get(i);
            }
        }
        return num1+num2;
    }
}