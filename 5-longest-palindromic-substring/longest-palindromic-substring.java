class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)return s;
        int maxLen=Integer.MIN_VALUE;
        int n=s.length();
        String max_sub="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String sub=s.substring(i,j+1);
                if(palindrome(sub)){
                    if(maxLen<sub.length()){
                        max_sub=sub;
                        maxLen=sub.length();
                    }
                }
            }
        }
        return maxLen==Integer.MIN_VALUE?s.substring(0,1):max_sub;
    }
    public boolean palindrome(String sub){
    int left = 0;
    int right = sub.length() - 1;

    while(left < right){
        if(sub.charAt(left) != sub.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}