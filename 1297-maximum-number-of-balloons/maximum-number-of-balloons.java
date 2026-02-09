class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:text.toCharArray()){
            if(c=='b' || c=='a' || c=='l' || c=='o' || c=='n'){
                m.put(c,m.getOrDefault(c,0)+1);
            }
        }
        int b=m.getOrDefault('b',0);
        int a=m.getOrDefault('a',0);
        int l=m.getOrDefault('l',0)/2;
        int o=m.getOrDefault('o',0)/2;
        int n=m.getOrDefault('n',0);
        int min=Math.min(Math.min(Math.min(b,a),Math.min(l,o)),n);
        return min;
    }
}