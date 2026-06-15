class Solution {
   
    class Pair {
        int node;
        double prob;
        public Pair(int node , double prob){
            this.node = node;
            this.prob = prob;
        }
    }
     // Applying Dijsktra's Algorithm
    public double maxProb(List<List<Pair>> adj , int n , int start , int end){
        double ans[] = new double[n];
        Arrays.fill(ans , 0.0);
        ans[start] = 1.0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.prob, a.prob));
        pq.add(new Pair(start , 1.0));
        while(!pq.isEmpty()){
            Pair p1 = pq.poll();
            int node = p1.node;
            double probb = p1.prob;
            if(probb < ans[node]) continue;
            for(Pair p2 : adj.get(node)){
                double totalProb = p1.prob * p2.prob;
                if(totalProb > ans[p2.node]){
                    ans[p2.node] = totalProb;
                    pq.add(new Pair(p2.node ,totalProb));
                }
            }
        }
        return ans[end];
        
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i =0; i <n; i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i =0; i <edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];

            adj.get(u).add(new Pair(v,prob));
            adj.get(v).add(new Pair(u,prob));
        }
        return maxProb(adj,n,start_node,end_node);
    }
}