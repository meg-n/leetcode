class UndergroundSystem {
    private Map<Integer, Pair<String, Integer>> map = null;
    private Map<String, List<Integer>> times = null;
    public UndergroundSystem() {
        map = new HashMap<>();
        times = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map.put(id,new Pair<>(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        String start = map.get(id).getKey();
        int time = t - map.get(id).getValue(); 
        String route = start+"_"+stationName;
        if(!times.containsKey(route)){
            times.put(route, new ArrayList<>());
        }
        times.get(route).add(time);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "_" + endStation;
        List<Integer> list = times.get(route);
        double sum = 0;
        for(int i : list){
           sum += i; 
        }
        double avg = sum/list.size();
        return avg;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */