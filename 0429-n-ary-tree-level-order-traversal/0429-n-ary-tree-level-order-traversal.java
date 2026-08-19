/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> order(Node root , List<List<Integer>> ans){
        if(root == null) return ans;
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size  = q.size();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0 ;i<size;i++){
                
                

                
                Node curr = q.poll();
                
                if(curr.children !=null){
                  
                    arr.add(curr.val);
                    for(Node child:curr.children){
                        q.offer(child);
                    }
                }
            }
            ans.add(arr);
        }
        return ans;
    }
    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        return order(root , ans);

        
    }
}