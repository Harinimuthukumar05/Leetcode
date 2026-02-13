class Solution {
    public List<Integer> getRow(int rowIndex) {
        long val=1;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            arr.add((int)val);
            val=val*(rowIndex-i)/(i+1);
        }
        return arr;
    }
}