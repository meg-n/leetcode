/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private Map<Node,Node> map = new HashMap<>();
    public Node cloneGraph1(Node node) {
       Set<Node> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        Node u = new Node(node.val);
        Node q = u;
        while(!stack.isEmpty()){
            Node current = stack.pop();
            if(q!=null){
                q = new Node(current.val);
            } 
            for(Node n : current.neighbors){
                if(!visited.contains(n)){
                    stack.push(n);
                    visited.add(n);   
                }
                Node qn = new Node(n.val);
                q.neighbors.add(qn);                    
            }
        }
        return u;
    }
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        if(map.containsKey(node)) return map.get(node);
        
        Node clone = new Node(node.val, new ArrayList());
        
        map.put(node,clone);
        for(Node n : node.neighbors){
            clone.neighbors.add(cloneGraph(n));
        }
        return clone;
    }
}