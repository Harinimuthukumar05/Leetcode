class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        String vow="aeiou";
        int maxvow=0;
        int maxcon=0;
        for(int i=0;i<26;i++){
            char ch=(char)(i+'a');
            if(vow.indexOf(ch)!=-1){
                maxvow=Math.max(maxvow,freq[i]);
            }
            else{
                maxcon=Math.max(maxcon,freq[i]);
            }
        }
        return maxcon+maxvow;
    }
}