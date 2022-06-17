class Solution {
    public int[] topKFrequent2(int[] nums, int k) {
    
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Queue<Integer> maxheap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(int key : map.keySet()){ maxheap.add(key); }
        
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = maxheap.poll();
        }
        
        return ans; 
    }
    public int[] topKFrequent(int[] nums, int k) {
    
        Map<Integer, Integer> map = new HashMap<>();
        for(int i  : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        Queue<Integer> q = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
        
        for(int i : map.keySet()) q.add(i);
        
        int[] ans = new int[k];
        for(int i=0; i<k;i++) ans[i] = q.poll();
        
        return ans;
    }

}