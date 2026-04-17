class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int [] > res = new ArrayList<>();
        int [] newInterval = intervals[0];
        res.add(newInterval);

        for(int [] arr : intervals){
            if(arr[0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1],arr[1]);
            } else {
                newInterval = arr;
                res.add(newInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}