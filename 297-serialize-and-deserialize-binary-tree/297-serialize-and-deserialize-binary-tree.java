/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        String e= s(root,sb);
        System.out.println(e);
        return e;
    }
    public String s(TreeNode root, StringBuilder sb) {
        if(root == null) 
           sb.append("null").append(";");
        else{
            sb.append(root.val).append(";");
            s(root.left,sb);
            s(root.right,sb);
        }
        return sb.toString();
    }   
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] input = data.split(";");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(input));
        System.out.println(list);
        return d(list);
    }
    public TreeNode d(ArrayList<String> list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left = d(list);
        root.right = d(list);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));