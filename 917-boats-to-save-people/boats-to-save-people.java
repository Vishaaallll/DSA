class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;                  // Pointer to the lightest person
        int j = people.length - 1;  // Pointer to the heaviest person
        int boats = 0;
        
        while (i <= j) {
            // If the lightest and heaviest can share a boat
            if (people[i] + people[j] <= limit) {
                i++; // Lightest person gets on board
            }
            // Heaviest person always gets a boat (either shared or alone)
            j--;
            boats++;
        }
        
        return boats;
    }
}