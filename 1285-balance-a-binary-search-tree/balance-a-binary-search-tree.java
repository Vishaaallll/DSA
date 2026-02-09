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
    public TreeNode buildTree(int start , int end , List<TreeNode> list){
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = list.get(mid);
        root.left = buildTree(start , mid-1 ,list);
        root.right = buildTree(mid+1,end ,list);
        return root;
    }
    public void inOrder(TreeNode root , List<TreeNode> list){
        if(root == null) return ;
        inOrder(root.left,list);
        list.add(root);
        inOrder(root.right,list);
    }
    public TreeNode balanceBST(TreeNode root) {
          List<TreeNode> list = new ArrayList<>();
        inOrder(root,list);
        return buildTree(0,list.size()-1,list);
    }
}