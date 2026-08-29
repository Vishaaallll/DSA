class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sr = source[0], sc = source[1];
        int tr = target[0], tc = target[1];

        // Check if source and target are on different colored squares
        if ((sr + sc) % 2 != (tr + tc) % 2) {
            return -1;
        }

        // Check if source and target lie on the same diagonal
        if (sr - sc == tr - tc || sr + sc == tr + tc) {
            return 1;
        }

        // If same color but not on the same diagonal, it takes 2 moves
        return 2;
    }
}