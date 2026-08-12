class Solution {
    public int vowelConsonantScore(String s) {
        String vow="aeiou";
        int v=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vow.contains(String.valueOf(ch))){
                v++;
            }
            else if (ch >= 'a' && ch <= 'z'){
                c++;
            }
        }
        return (c>0)?Math.floorDiv(v,c):0;
    }
}