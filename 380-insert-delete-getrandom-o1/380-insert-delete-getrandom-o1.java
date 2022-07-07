class RandomizedSet {
    List<Integer> list;
    public RandomizedSet() {
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
            if(list.contains(val)){
                return false;
            }
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!list.contains(val)){
            return false;
        } 
        list.remove(list.indexOf(val));
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