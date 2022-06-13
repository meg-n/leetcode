class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i< pre.length; i++){
            if(!map.containsKey(pre[i][0])){
                map.put(pre[i][0], new ArrayList<>());
            }     
            map.get(pre[i][0]).add(pre[i][1]);
            if(!map.containsKey(pre[i][1])){
                map.put(pre[i][1], new ArrayList<>());
            }     
        }
        
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            if(!dfs(map, set, entry.getKey())) return false; 
        }
        return true;
    }
    private static boolean dfs(Map<Integer, List<Integer>> map, Set<Integer> set, int course){
        if(set.contains(course)) return false;
        if(map.containsKey(course) && map.get(course).isEmpty()) return true;
        System.out.print("course " + course);
        set.add(course);    
        for(Integer pre : map.get(course)){
            if(!dfs(map,set,pre)) return false;
        }
        set.remove(course);
        map.get(course).clear();
        return true;        
    }
}