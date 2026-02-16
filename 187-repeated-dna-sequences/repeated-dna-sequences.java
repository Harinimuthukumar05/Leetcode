class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10)return (new ArrayList<>());
        Set<String> set=new HashSet<>();
        Map<String,Integer> m=new HashMap<>();
        int k=10;
        for(int i=0;i<k;i++){
            m.put(s.substring(i,k),1);
        }
        for(int i=k;i<s.length();i++){
            String sub=s.substring(i-k+1,i+1);
            if(m.containsKey(sub)){
                set.add(sub);
            }
            else{
                m.put(sub,1);
            }
        }
        List<String> res=new ArrayList<>();
        for(String c:set){
            res.add(c);
        }
        return res;
    }
}