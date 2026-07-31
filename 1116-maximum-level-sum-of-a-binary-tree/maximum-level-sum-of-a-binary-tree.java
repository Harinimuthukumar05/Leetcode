/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root==null)return 0;
        int ans=0;
        int maxSum=Integer.MIN_VALUE;
        int level=1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode popped=q.poll();
                sum+=popped.val;
                if(popped.left!=null)q.add(popped.left);
                if(popped.right!=null)q.add(popped.right);
            }
            if(sum>maxSum){
                maxSum=sum;
                ans=level;
            }
            level++;
        }
        return ans;
    }
}