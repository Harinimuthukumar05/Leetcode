class Solution {
    public int myAtoi(String s) {
        int num=0;
        boolean sign=false;
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(i==0 && s.charAt(i)=='-'){
                sign=true;
                continue;
            }
            if(i==0 && s.charAt(i)=='+'){
                continue;
            }
            if (!Character.isDigit(s.charAt(i))){
                break;
            }
            int digit=s.charAt(i)-'0';
            if (num > (Integer.MAX_VALUE - digit) / 10){
                return sign?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            num=num*10+digit;
        }
        return sign?-num:num;
    }
}