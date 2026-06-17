class Pair{
    int node;
    int cost;
    public Pair(int node , int cost){
        this.node = node;
        this.cost = cost;
    }
}
class Tuple{
    int stops;
    int nodes;
    int cost;
    public Tuple(int stops, int nodes, int cost){
        this.stops = stops;
        this.nodes = nodes;
        this.cost = cost;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i =0; i <n; i++){
            adj.add(new ArrayList<>());
        }
        for(int [] f :flights){
            int u = f[0];
            int v = f[1];
            int c = f[2];

            adj.get(u).add(new Pair(v,c));
        }

        int [] dist = new int[n];
        Arrays.fill(dist , Integer.MAX_VALUE);
        dist[src] =0;
        // Applying Dijkstra's Algorithm
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(0,src ,0));
        while(!q.isEmpty()){
            Tuple t = q.poll();

            int stop = t.stops;
            int n1 = t.nodes;
            int c = t.cost;
            if(stop > k) continue;
            for(Pair p : adj.get(n1)){
                int n2 = p.node;
                int c1 = p.cost;

                if(c1 +c < dist[n2] && stop <= k){
                    dist[n2] = c1+c;
                    q.add(new Tuple(stop +1 , n2 , c1+c));
                }
            }
        }
        return  dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}