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
    int ans=0;
    public int maxAncestorDiff(TreeNode root) {
        maxDiff(root,root.val,root.val);
        return ans;
    }
    public void maxDiff(TreeNode root,int max,int min){
        if(root==null)return;
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
        int diff=Math.abs(max-min);
        ans=Math.max(ans,diff);
        maxDiff(root.left,max,min);
        maxDiff(root.right,max,min);
    }
}