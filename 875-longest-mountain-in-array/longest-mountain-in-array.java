class Solution {
    public int longestMountain(int[] arr) {
        int up=0,down=0,maxLen=0;
        for(int i=1;i<arr.length;i++){
            if(down>0 && arr[i]>arr[i-1] || arr[i]==arr[i-1]){
                up=0;
                down=0;
            }
            if(arr[i]>arr[i-1]){
                up++;
            }
            else if(arr[i]<arr[i-1]){
                down++;
            }
            if(up>0 && down>0){
                maxLen=Math.max(maxLen,up+down+1);
            }
        }
        return maxLen;
    }
}