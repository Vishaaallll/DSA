class Solution {
    public int gcd(int a , int b){
        if(a%b == 0){
            return b;
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max = -1;
        int [] gcdArr = new int[n];
        for(int i =0; i<n; i++){
            max = Math.max(max,nums[i]);
            gcdArr[i] = gcd(max,nums[i]);
        }
        Arrays.sort(gcdArr);
        int i =0;
        int j = n-1;
        long sum = 0;
        while(i<=j){
            if(i==j) return sum;
            sum += gcd(gcdArr[i],gcdArr[j]);
            i++;
            j--;
        }
        return sum;
    }
}