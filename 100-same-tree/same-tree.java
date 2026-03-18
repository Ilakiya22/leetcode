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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        preOrder(p,list1);
        preOrder(q,list2);
        if(list1.equals(list2)){
            return true;
        }
        return false;
    
        
    }
    public void preOrder(TreeNode root,List<Integer> res){
        if(root==null){
            res.add(null);
            return;
        }
        res.add(root.val);
        preOrder(root.left,res); 
        preOrder(root.right,res);
    }
    
}