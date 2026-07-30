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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        

        return isSym(root.left,root.right);
    }
    public boolean isSym(TreeNode p,TreeNode q){
        if(p!=null && q==null)return false;
        if(q!=null && p==null)return false;
        if(q==null && p==null)return true;
        if(p.val!=q.val)return false;
        boolean leftSym=isSym(p.left,q.right);
        boolean rightSym=isSym(p.right,q.left);

        return leftSym && rightSym;
    }
}