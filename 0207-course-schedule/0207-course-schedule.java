class Solution {
    public boolean dfs(int i , List<List<Integer>> adj , boolean[] path  ,boolean[] vis){
        path[i] = true;
        vis[i] = true;
        for(int ele:adj.get(i)){
            if(path[ele]==true)return false;
            if(vis[ele]==false)
            if(!dfs(ele,adj,path,vis)){
                return false;
            }

        }
        path[i]=false;
        return true;
    }



    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ;i<n;i++) adj.add(new ArrayList<>());
        for(int i = 0 ;i<pre.length;i++){
            int a = pre[i][0] ;int b = pre[i][1];
            adj.get(b).add(a);
            
        }
        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];
        for(int i = 0;i<n;i++){
           
           if(vis[i]==false){
             if(!dfs(i, adj , path ,vis)){
                return false;
             };
           }
        }
        return true;
        
    }
}