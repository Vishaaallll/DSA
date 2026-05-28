class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 1; i <= numCourses; i++){
            adj.add(new ArrayList<>());
        }
        int [] indegree = new int[numCourses];
        boolean [] visited = new boolean[numCourses]; 
        for(int i =0; i < pre.length; i++){
            int a = pre[i][0] , b = pre[i][1];
            adj.get(b).add(a);
            indegree[a]++;
        }
        // Kahn's algorithm
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i =0; i < numCourses ; i++){
            if(indegree[i] == 0){
                q.add(i);
                visited[i] = true;
            }
        }
        while(!q.isEmpty()){
            int front = q.poll();
            ans.add(front);
            for(int el : adj.get(front)){
                indegree[el]--;
                if(indegree[el]==0){
                    q.add(el);
                    visited[el] = true;
                }
            }
        }
        return ans.size() == numCourses ? true : false ;
    }
}