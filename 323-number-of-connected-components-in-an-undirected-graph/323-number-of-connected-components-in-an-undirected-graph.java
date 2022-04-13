class Solution {

    public int countComponents(int n, int[][] edges) {
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
        int count =0;
        Set<Integer> visitedSet = new HashSet<>();

        for(int i = 0;i<n;i++){
            if(!visitedSet.contains(i)){
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                while(!stack.isEmpty()){
                    int current = stack.pop();
                    if(!visitedSet.contains(current)) {
                    visitedSet.add(current);
                    List<Integer> vals = map.get(current);
                    if(vals!=null){
                        for(Integer h: vals){
                        stack.push(h);
                    }   
                    }

                    }
                }
                count++;
            }
        }
        return count;
    }
}