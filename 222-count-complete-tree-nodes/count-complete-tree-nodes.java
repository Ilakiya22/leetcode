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
    public int countNodes(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        return list.size();

        
    }
    private void inOrder(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        else{
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right,list);
        }
    }
}