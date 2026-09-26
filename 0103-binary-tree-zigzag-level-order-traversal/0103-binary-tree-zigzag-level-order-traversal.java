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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int s = q.size();
            
            LinkedList<Integer> level = new LinkedList<>();
            for(int i= 0 ;i<s;i++){
                TreeNode first = q.remove();
                if(leftToRight){
                    level.addLast(first.val);
                }
                else{
                    level.addFirst(first.val);
                }
                if(first.left !=null){
                    q.add(first.left);
                }
                if(first.right !=null){
                    q.add(first.right);
                }
              

            }
            ans.add(level);
            leftToRight =!leftToRight;
        }
        return ans;

        
    }
}