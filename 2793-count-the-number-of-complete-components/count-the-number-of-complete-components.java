class Solution {
    public int[] bfs(int start ,boolean [] visited , List<List<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        int node = 0;
        int degreeSum = 0;
        while(!q.isEmpty()){
            int el = q.poll();
            node++;
            degreeSum += adj.get(el).size();

            for(int ele : adj.get(el)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele] = true;
                }
            }
        }
        return new int[]{node , degreeSum};
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0; i < n; i++ ){
            adj.add(new ArrayList<>());
        }
        for(int [] arr : edges){
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
        }
        int count = 0;
        boolean [] visited = new boolean[n];
        for(int i =0; i < n; i++){
            if(!visited[i]){
                int [] arr = bfs(i , visited, adj);
                int node = arr[0];
                int degreesum = arr[1];
                if(degreesum == node * (node -1)){
                    count++;
                }
            }
        }
        return count;
    }
}