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
    // O(n) - depth first - stack takes up the size n
//     public TreeNode invertTree(TreeNode root) {
//         if(root == null) return root;
//         invertTree(root.left);
//         invertTree(root.right);
        
//         TreeNode temp = root.right;
//         root.right = root.left;
//         root.left = temp;
//         return root;
//     }
    // O(n) - breadth first
    public TreeNode invertTreeBFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            TreeNode temp = currentNode.right;
            currentNode.right = currentNode.left;
            currentNode.left = temp;
            
            if(currentNode.left != null) queue.add(currentNode.left);
            if(currentNode.right != null ) queue.add(currentNode.right);
        }
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null ) return root;
        invertTree(root.left);
        invertTree(root.right);
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        return root;
    }
}