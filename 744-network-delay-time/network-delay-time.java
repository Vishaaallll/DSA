class Pair implements Comparable<Pair>{
    int  node;
    int dist;
    public Pair(int node , int dist){
        this.node = node;
        this.dist = dist;
    }
    public int compareTo(Pair p){
        if(this.dist == p.dist ) return this.node - p.node;
        return this.dist - p.dist;
    }
}
class Solution {
    
    public static int networkDelay( List<List<Pair>> adj , int src , int n ){
        int [] ans = new int[n+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Pair::compareTo);
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair p1 = pq.poll();
            int node = p1.node;
            int cost = p1.dist;

            if(cost > ans[node]) continue;

            for(Pair p2 : adj.get(node)){
                int val = p1.dist + p2.dist;
                if(ans[p2.node] > val){
                    ans[p2.node] = val;
                    pq.add(new Pair(p2.node , val));
                }
            }
        }
        int max = -1;
        for(int i =1; i <= n; i++){
            if(ans[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max , ans[i]);
        }
        return max;
     }
     public static void addElement(int i , int j , int dist , List<List<Pair>> adj){
            adj.get(i).add(new Pair(j,dist));
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
         for(int i =0; i<=n; i++){
             adj.add(new ArrayList<>());
         }
         for(int [] arr : times){
             int src = arr[0];
             int dest = arr[1];
             int time = arr[2];
             addElement(src,dest,time,adj);
         }
         return networkDelay(adj,k,n);
    }
}