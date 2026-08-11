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
    public int find(TreeNode root,int min , int secondmin){
        if(root ==null) return secondmin;
        if(root.val > min){
            if(secondmin ==-1 || root.val<secondmin){
            secondmin = root.val;
        }
        }

        
        
         
       
        secondmin = find(root.left,min,secondmin);
        secondmin = find(root.right,min,secondmin);
        return secondmin;
       

    }
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null)return -1;
        return find(root, root.val,-1);
       




        
    }
}