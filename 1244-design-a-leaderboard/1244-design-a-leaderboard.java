class Leaderboard {
    Map<Integer, Integer> map = new HashMap<>();
    public Leaderboard() {
        map = new HashMap<Integer, Integer>();
    }
    
    public void addScore(int playerId, int score) {
        map.put(playerId, map.getOrDefault(playerId,0) + score);
    }
    
    public int top(int K) {
        PriorityQueue<Integer> q =new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        for(Integer i : map.values()){
            q.offer(i);
        }
        int score = 0;
        for(int i = 0; i<K;i++){
            score += q.poll();
        }
        return score;
    }
    
    public void reset(int playerId) {
        map.put(playerId, 0);
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */