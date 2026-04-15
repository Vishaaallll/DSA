class Solution {
    public void helper(int idx , int [] candidates , int target ,List<Integer> ans,List<List<Integer>> res ){
        if(target == 0){
            res.add(new ArrayList<>(ans));
            return;
        }

        if(idx == candidates.length || target < 0) return;
        // include
        int n = candidates[idx];
        ans.add(n);
        helper(idx,candidates,target -candidates[idx],ans,res);
        // exclude
        ans.remove(ans.size()-1);
        helper(idx+1,candidates,target,ans,res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(0,candidates,target,ans,res);
        return res;
    }
}