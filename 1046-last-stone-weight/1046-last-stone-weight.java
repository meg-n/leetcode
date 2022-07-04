class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>((o1,o2) -> Integer.compare(o2,o1));
        for(Integer i : stones){
            q.offer(i);
        }
        while(q.size() >1){
            int y = q.poll();

            int x = q.poll();

            if(y != x){
                q.offer(y-x);   
            }
        }
        return q.isEmpty() ? 0 : q.poll();
    }
}