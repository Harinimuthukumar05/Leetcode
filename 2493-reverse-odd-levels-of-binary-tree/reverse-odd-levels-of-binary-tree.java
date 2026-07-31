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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null)return null;
        Queue<TreeNode> q=new LinkedList<>();
        int level=0;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<TreeNode> n=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode popped=q.poll();
                n.add(popped);
                if(popped.left!=null)q.add(popped.left);
                if(popped.right!=null)q.add(popped.right);
            }
            if(level%2==1){
                int l=0;
                int r=n.size()-1;
                while(l<=r){
                    int temp=n.get(l).val;
                    n.get(l).val=n.get(r).val;
                    n.get(r).val=temp;
                    l++;
                    r--;
                }

            }
            level++;
        }
        return root;
    }
}