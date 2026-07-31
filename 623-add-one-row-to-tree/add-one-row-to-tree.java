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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null)return null;
        if(depth==1){
            TreeNode nn=new TreeNode(val);
            nn.left=root;
            return nn;
        }
        return addRow(root,val,depth,1);
    }
    public TreeNode addRow(TreeNode root,int val,int depth,int i){
        if(root==null)return null;
        if(depth-1==i){
            TreeNode a=new TreeNode(val);
            TreeNode b=new TreeNode(val);
            TreeNode oldLeft=root.left;
            TreeNode oldRight=root.right;
            root.left=a;
            root.right=b;
            a.left=oldLeft;
            b.right=oldRight;
            return root;
        }
        else{
            addRow(root.left,val,depth,i+1);
            addRow(root.right,val,depth,i+1);
            return root;
        }

    }
}