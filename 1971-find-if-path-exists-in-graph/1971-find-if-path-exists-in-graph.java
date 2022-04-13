class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        if(source == destination) return true;
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i<edges.length; i++) {
            if(map.containsKey(edges[i][0])) {
                map.get(edges[i][0]).add(edges[i][1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(edges[i][1]);
                map.put(edges[i][0], list);
            }
            
            if(map.containsKey(edges[i][1])) {
                map.get(edges[i][1]).add(edges[i][0]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(edges[i][0]);
                map.put(edges[i][1], list);
            }
        }
        
        Stack<Integer> stack = new Stack<>();
        Set<Integer> seenSet = new HashSet<>();
        stack.push(source);
        
        while(!stack.isEmpty()){
            int current = stack.pop();
            if(!seenSet.contains(current)){
                if(current==destination) return true;
                seenSet.add(current);
                for(Integer i : map.get(current)){
                    stack.push(i);
                }
            }
        }
        return false;
    }
}