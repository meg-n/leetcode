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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null ) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        boolean b = false;
        queue.offer(root);
        while(!queue.isEmpty()){
            LinkedList<Integer> inner = new LinkedList<Integer>();
            int l = queue.size();
            
            for(int i = 0; i< l;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
                
                if(b) inner.addFirst(node.val);
                else inner.addLast(node.val);                
            }
            result.add(inner);
            b = !b;
        }
        return result;
    }
}