class Solution {
    public int countSegments(String s) {
        int count=0;
        boolean letter=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && !letter){
                count++;
                letter=true;
            }
            else if(s.charAt(i)==' '){
                letter=false;
            }
        }
        return count;
    }
}