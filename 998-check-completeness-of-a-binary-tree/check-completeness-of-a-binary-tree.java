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
    public boolean isCompleteTree(TreeNode root) {
        int total=countNodes(root);
        return isComplete(root,0,total);
    }
    public int countNodes(TreeNode root){
        if(root==null)return 0;
        int l=countNodes(root.left);
        int r=countNodes(root.right);
        return l+r+1;
    }
    public boolean isComplete(TreeNode root,int i,int total){
        if(root==null)return true;
        if(i>=total)return false;
        boolean l=isComplete(root.left,2*i+1,total);
        boolean r=isComplete(root.right,2*i+2,total);
        return l && r;
    }
}