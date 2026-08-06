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
    public boolean issum(TreeNode root, int sum, int targetSum){
        if(root == null)return false;
        sum +=root.val;
        if(root.left ==null && root.right == null){
            return sum == targetSum;
        }
       return  issum(root.left,sum,targetSum) ||
        issum(root.right,sum,targetSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return issum(root,0,targetSum);
        
    
        
    }
}