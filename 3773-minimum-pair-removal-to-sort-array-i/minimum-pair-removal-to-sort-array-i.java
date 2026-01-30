class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        int index=0;
        int operation=0;
        while(!nonDecreasing(list)){
            int minSum=Integer.MAX_VALUE;
            for(int i=0;i<list.size()-1;i++){
                if(minSum>list.get(i)+list.get(i+1)){
                    minSum=list.get(i)+list.get(i+1);
                    index=i;
                }
            }
            list.remove(index);
            list.remove(index);
            list.add(index,minSum);
            operation++;
        }
        return operation;
    }
    public boolean nonDecreasing(List<Integer> list){
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i-1))return false;
        }
        return true;
    }
}