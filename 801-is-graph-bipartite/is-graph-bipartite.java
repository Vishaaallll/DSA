class Solution {
    // color blue = 2;
    //  color red = 1;
    public boolean bfs(int i , int[][] graph ,boolean [] visited , int[] coloredArray){
        Queue<Integer> q =new LinkedList<>();
        q.add(i);
        visited[i] = true;
        coloredArray[i] = 1;
        while(!q.isEmpty()){
            int peek = q.remove();
            int color = coloredArray[peek];
            for(int u : graph[peek]){
                if(visited[u]){
                    if(color == coloredArray[u]){
                        return false;
                    }  
                } else {
                
                    visited[u] = true;
                    coloredArray[u] = (color == 1) ? 2 : 1;
                    q.add(u); 
                }
                
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        boolean [] visited = new boolean[n];
        int [] coloredArray = new int[n];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
              if(! bfs( i ,graph , visited,coloredArray)){
                return false;
              }
            }
        }
        return true;
    }
}