class Solution {
    int maxDepth = 0;
    public void dfs(int start , int parent , int depth , List<Integer> [] adj){
        maxDepth = Math.max(maxDepth , depth);
        for(int neighbour : adj[start]){
            if(neighbour != parent){
            dfs(neighbour , start , depth +1 ,adj);
            }
        }
    }
    private int power(long base, long exp, int mod) {
        long res = 1;
        base = base % mod;
        
        while (exp > 0) {
            
            if ((exp & 1) == 1) {
                res = (res * base) % mod;
            }
          
            base = (base * base) % mod;
            exp >>= 1; 
        }
        return (int) res;
    }
    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length +1;
        List<Integer >[] adj = new ArrayList[n+1];
        for(int i =1; i <= n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int [] arr : edges){
            int u = arr[0];
            int v = arr[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        maxDepth = 0;
        dfs(1,0,0,adj);
        int MOD = 1000000007;
        return power(2, maxDepth - 1, MOD);
    }
}