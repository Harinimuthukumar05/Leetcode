class Solution {
    public String trimTrailingVowels(String s) {
        String vow="aeiou";
        int count=s.length();
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(vow.contains(String.valueOf(c))){
                count--;
            }
            else break;
        }
        return s.substring(0,count);
    }
}