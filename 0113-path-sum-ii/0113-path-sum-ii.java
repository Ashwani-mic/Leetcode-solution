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
    public void path(TreeNode root , int sum , int targetSum,List<List<Integer>> ans,List<Integer> curr){
        if(root == null) return ;
        sum += root.val;
        curr.add(root.val);
        if(root.left ==null && root.right == null){
            if(sum ==targetSum){
                ans.add(new ArrayList<>(curr));
            }
            

        }
         path(root.left,sum,targetSum,ans,curr);
         path(root.right,sum,targetSum,ans,curr);
        curr.remove(curr.size()-1);
       
       
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        path(root,0,targetSum,ans,new ArrayList<>());
        return ans ;
        
    }
}