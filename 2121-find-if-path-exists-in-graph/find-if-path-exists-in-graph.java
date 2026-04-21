class Solution {
    public void bfs(int i , List<List<Integer>> adj , boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int el = q.remove();
            for(int a : adj.get(el)){
                if(!visited[a]){
                    q.add(a);
                    visited[a] = true;
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if(source == destination) return true;

        List<List<Integer>> adj = new ArrayList<>();
        for( int i =0; i< n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            int e1 = edges[i][0] , e2 = edges[i][1];
            adj.get(e1).add(e2);
            adj.get(e2).add(e1);
        }

        boolean [] visited = new boolean[n];
         visited[source] = true;
         bfs(source,adj,visited);
         return visited[destination] == true;
    }
}