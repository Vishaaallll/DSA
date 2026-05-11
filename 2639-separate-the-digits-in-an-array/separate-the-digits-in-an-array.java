class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        
        for (int num : nums) {
           
            List<Integer> temp = new ArrayList<>();
            while (num > 0) {
                temp.add(num % 10);
                num /= 10;
            }
            for (int i = temp.size() - 1; i >= 0; i--) {
                resultList.add(temp.get(i));
            }
        }
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}