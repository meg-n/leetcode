class RandomizedSet {
    List<Integer> list;
    HashMap<Integer,Integer> map; 
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
            if(map.containsKey(val)){
                return false;
            }

        map.put(val, list.size());
        list.add(list.size(),val);

        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        } 

        list.set(map.get(val), list.get(list.size()-1));
        map.put( list.get(list.size()-1), map.get(val));
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random r = new Random();
        return list.get(r.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */