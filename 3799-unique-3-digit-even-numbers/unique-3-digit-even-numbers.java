class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Step 2: Iterate over all 3-digit even numbers
        for (int num = 100; num <= 998; num += 2) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;

            // Step 3: Count digit frequencies needed for 'num'
            int[] currentFreq = new int[10];
            currentFreq[d1]++;
            currentFreq[d2]++;
            currentFreq[d3]++;

            // Step 4: Verify if we have enough digits available
            boolean possible = true;
            for (int i = 0; i < 10; i++) {
                if (currentFreq[i] > freq[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                count++;
            }
        }

        return count;
    
    }
}