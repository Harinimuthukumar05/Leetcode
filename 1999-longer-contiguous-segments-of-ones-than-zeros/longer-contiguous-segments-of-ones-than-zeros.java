class Solution {
    public boolean checkZeroOnes(String s) {
        int count0=0;
        int count1=0;
        int maxCount0=0;
        int maxCount1=0;
        if(s.length()==1){
            if(s.charAt(0)=='1')return true;
            else return false;
        }
        if(s.charAt(0)=='0'){
            count0=1;
            maxCount0=1;
        }
        else{
            count1=1;
            maxCount1=0;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                if(s.charAt(i)=='0'){
                    count0++;
                }
                else{ 
                    count1++;
                }
            }
            else{
                if(s.charAt(i)=='0' && s.charAt(i-1)=='1'){
                    count0=1;
                    count1=0;
                }
                else{
                    count1=1;
                    count0=0;
                }
            }
            maxCount0=Math.max(count0,maxCount0);
            maxCount1=Math.max(count1,maxCount1);
        }
        return maxCount1>maxCount0;
    }
}