class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        
        int n = skill.length;
        int targetSum = skill[0] + skill[n - 1];
        long totalChemistry = 0;
        
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            int currentSum = skill[left] + skill[right];
            
           if (currentSum != targetSum) {
                return -1;
            }
            
            totalChemistry += (long) skill[left] * skill[right];
            
            left++;
            right--;
        }
        
        return totalChemistry;
    }
}