class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> s=new HashSet<>();
        int count=0;
        for(char c:jewels.toCharArray()){
            s.add(c);
        }
        for(char c:stones.toCharArray()){
            if(s.contains(c)){
                count++;
            }
        }
        return count;
    }
}