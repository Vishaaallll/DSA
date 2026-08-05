class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> list = new ArrayList<>();
        int [] inDegree = new int[n];
        boolean [] suspicious = new boolean[n];

        // Adj list
        for(int i =0; i<n; i++){
            list.add(new ArrayList<>());
        }
        for(int [] a : invocations){
            int u = a[0];
            int v = a[1];
            inDegree[v]++;

            list.get(u).add(v);
        }
        // Bfs
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        suspicious[k] = true;
        while(!q.isEmpty()){
            int neighbour = q.poll();
            for(int n1 : list.get(neighbour)){
                inDegree[n1]--;
                if(!suspicious[n1]){
                    q.add(n1);
                    suspicious[n1] = true;
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        boolean flag = false;
        for(int i=0; i< n; i++){
            if(suspicious[i] && inDegree[i] > 0){
                flag = true;
                break;
            }
            if(!suspicious[i]){
                res.add(i);
            }
        }
        if(flag){
            List<Integer> res1 = new ArrayList<>();
            for(int i=0; i< n; i++){
                res1.add(i);
            }
            return res1;
        }
        return res;
    }
}