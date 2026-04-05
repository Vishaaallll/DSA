class Solution {
    public int mirrorFrequency(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int totalSum = 0;
        Set<Character> seen = new HashSet<>();

        for (char c : freqMap.keySet()) {
            if (seen.contains(c)) {
                continue;
            }

            char mirror;
            if (Character.isLetter(c)) {
                mirror = (char) ('a' + 'z' - c);
            } else if (Character.isDigit(c)) {
                mirror = (char) ('0' + '9' - c);
            } else {
                continue;
            }

            int freqC = freqMap.get(c);
            int freqM = freqMap.getOrDefault(mirror, 0);
            totalSum += Math.abs(freqC - freqM);

        
            seen.add(c);
            seen.add(mirror);
        }

        return totalSum;
    }
}