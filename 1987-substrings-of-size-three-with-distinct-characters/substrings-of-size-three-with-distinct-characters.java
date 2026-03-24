class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3)return 0;
         int count=0;
         int k=3;
         HashMap<Character,Integer> map=new HashMap<>();
         for(int i=0;i<3;i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
         }
         if(isUnique(map)){
            count++;
         }
         for(int i=k;i<s.length();i++){
            map.put(s.charAt(i-k),map.getOrDefault(s.charAt(i-k),0)-1);
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(isUnique(map)){
                count++;
            }
         }
         return count;
    }
    public boolean isUnique(HashMap<Character,Integer> m){
        for(int x:m.values()){
            if(x>1)return false;
        }
        return true;
    }
}