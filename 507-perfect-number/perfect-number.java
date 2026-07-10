class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1; // 1 is a divisor for all positive integers > 1
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                
                // Add the paired divisor (num / i) if it's different from i
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }

        // Check if the sum of proper divisors equals the original number
        return sum == num;
    }
}