/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        int v = -1;
        Set<Integer> set = new HashSet<>();
        HashMap <Integer , TreeNode > map = new HashMap<>();
        for(int [] arr : descriptions){
            set.add(arr[1]);
        }
        for(int [] arr : descriptions){
            if(!set.contains(arr[0])){
                v = arr[0];
            }
        }

        for(int [] arr : descriptions){
            int p = arr[0];
            int c = arr[1];
            int d = arr[2];
            map.putIfAbsent(p , new TreeNode(p));
            TreeNode parent = map.get(p);

            map.putIfAbsent(c , new TreeNode(c));
            TreeNode child = map.get(c);

            if(d == 1) {
                parent.left = child;
            } else {
                parent.right = child;
            }
            
        }
        return  map.get(v);
    }
}