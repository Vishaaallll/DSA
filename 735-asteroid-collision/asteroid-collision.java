class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n= arr.length;
        for(int i =0; i < n; i++){
            boolean exploded = false;
            while(!stack.isEmpty() && stack.peek() > 0 && arr[i] < 0){
                if(Math.abs(arr[i]) > stack.peek()){
                    stack.pop();
                    continue;
                } else if(Math.abs(arr[i])== stack.peek()) {
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                    exploded = true;
                    break;
                }
            }
            if(!exploded){
                stack.push(arr[i]);
            }
        }

      
      int [] res = new int[stack.size()];
      int i = res.length-1;
      while(!stack.isEmpty()){
        res[i--] = stack.pop();
      }
      return res;
    }
}