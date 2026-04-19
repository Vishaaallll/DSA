class Solution {
    public void bfs(int i , boolean [] visited , List<List<Integer>> rooms){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int l = q.remove();
            
            for(int ele : rooms.get(l)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele] = true;
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        int count = 0;
        boolean [] visited = new boolean[n];
        visited[0] = true;
        bfs(0,visited,rooms);

        for(boolean flag : visited){
            if(!flag) return false;
        }
        return  true;
    }
}