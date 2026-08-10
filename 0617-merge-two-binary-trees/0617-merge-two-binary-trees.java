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
    public TreeNode finalTree(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null) return null;
        TreeNode root;
        
        if(root1 !=null && root2 ==null){
             root = new TreeNode(root1.val);

        }
        else if(root1 ==null && root2 !=null) {
             root = new TreeNode(root2.val);

        }
        else {
             root = new TreeNode(root1.val + root2.val);

        }
        root.left = finalTree(root1  !=null ? root1.left :null,root2  !=null ?root2.left:null);
        root.right = finalTree(root1  !=null ? root1.right :null,root2   !=null ?root2.right:null);
        return root;
        
        
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        
        return finalTree(root1,root2);
        
    }
}