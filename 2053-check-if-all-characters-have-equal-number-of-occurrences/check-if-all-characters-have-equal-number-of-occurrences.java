class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int ch=m.get(s.charAt(0));
        for(int c:m.values()){
            if(c!=ch){
                return false;
            }
        }
        return true;
    }
}