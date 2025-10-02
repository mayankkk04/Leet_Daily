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
    public static void nthlevel(TreeNode root, int n, List<Integer> arr){
        if(root == null) return;
        if(n == 1) arr.add(root.val);
        nthlevel(root.left, n-1, arr);
        nthlevel(root.right, n-1, arr);
    }
    public static void nthlevel2(TreeNode root, int n, List<Integer> arr){
        if(root == null) return;
        if(n == 1)  arr.add(root.val);
        nthlevel2(root.right, n-1, arr);
        nthlevel2(root.left, n-1, arr);
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        int level = height(root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1 ; i <= level ; i++){
            List<Integer> arr = new ArrayList<>();
            if(i % 2 == 0) nthlevel2(root,i,arr);
            else nthlevel(root,i,arr);
            ans.add(arr);
        }
        return ans;
    }
}