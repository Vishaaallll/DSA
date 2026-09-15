class Solution {
   
    public int maxProduct(int[] nums) {
       int PrefixMax = Integer.MIN_VALUE;
       int prefix = 1;
       for(int i =0; i < nums.length; i++){
          prefix *= nums[i];
          PrefixMax = Math.max(prefix,PrefixMax);
          if (prefix == 0) prefix = 1;
       }
       int SuffixMax = Integer.MIN_VALUE;
       int suffix = 1;
       for(int i = nums.length -1; i>= 0; i--){
           suffix *= nums[i];
           SuffixMax = Math.max(suffix,SuffixMax);
           if (suffix == 0) suffix = 1;

       }
       return Math.max(PrefixMax,SuffixMax);
    }
}