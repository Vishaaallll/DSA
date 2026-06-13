class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = graph.length;
        for(int i =0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        int [] indegree = new int[n];
        for(int i =0; i<n;i++){
            
            for(int ele : graph[i]){
                adj.get(ele).add(i);
                indegree[i]++;
            }
        }
       // Apply Kahn's algorithm
       List<Integer> ans = new ArrayList<>();
       Queue<Integer> q = new LinkedList<>();
       for(int i =0; i < n; i++){
          if(indegree[i] ==0){
            q.add(i);
          }
        }
       while(!q.isEmpty()){
            int front = q.poll();
            ans.add(front);
            for(int ele : adj.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0){
                    q.add(ele);
                }
            }
       }
       Collections.sort(ans);
       return ans;
    }
}