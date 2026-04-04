class Solution {
    public String reverseVowels(String s) {
        int start=0,end=s.length()-1;
        String vowel="aeiouAEIOU";
        char[] result=s.toCharArray();
        while(start<end){
            if(!vowel.contains(String.valueOf(result[start]))){
                start++;
            }
            else if(!vowel.contains(String.valueOf(result[end]))){
                end--;
            }
            else{
                char temp=result[start];
                result[start]=result[end];
                result[end]=temp;
                start++;
                end--;
            }
        }
        return new String(result);
    }
}