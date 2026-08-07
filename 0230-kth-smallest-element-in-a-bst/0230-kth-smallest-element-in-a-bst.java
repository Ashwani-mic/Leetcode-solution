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
    public void node(TreeNode root ,List<Integer> arr ){
        if(root == null) return  ;
        arr.add(root.val);
        node(root.left,arr);
        node(root.right,arr);
       
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        node(root,arr);
        Collections.sort(arr);
        for(int i =0;i<arr.size();i++){
            if(k ==i+1){
                return arr.remove(i);
            }
        }
        return 0;

        
    }
}