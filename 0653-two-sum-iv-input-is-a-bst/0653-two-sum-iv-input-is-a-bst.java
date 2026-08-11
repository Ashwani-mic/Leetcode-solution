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
    HashSet<Integer> set = new HashSet<>();
    public boolean target(TreeNode root,int k ){
        if(root == null) return false;
        int needed  = k-root.val;
        if(set.contains(needed))return true;
        set.add(root.val);
        return target(root.left,k) ||
         target(root.right,k);
    }
    public boolean findTarget(TreeNode root, int k) {
        return target(root,k);
        
        
    }
}