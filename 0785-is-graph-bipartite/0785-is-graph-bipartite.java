class Solution {
    
    public boolean dfs(int i , int[][] grid ,int[] vis){
        int color = vis[i];
        for(int ele:grid[i]){
            if(vis[ele]==-1 ){
                vis[ele] = 1-color;
               if(!dfs(ele,grid,vis)){
                return false;
               }
              
            }
            if (vis[ele]==color){
            return false;
           }
          

        }
        return true;
        
    }


    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        
        int[] vis = new int[n];
        
        Arrays.fill(vis,-1);
       
        for(int i = 0 ;i<n;i++){
            if(vis[i]==-1 ){
                vis[i]=0;
                 if(!dfs(i,graph,vis)){
                    return false;
                 }
            }
        }
        return true;

        
    }
}