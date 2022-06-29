class KthLargest {
    Queue<Integer> q;
    int k;
    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>((o1,o2)-> o1-o2);
        for(int i = 0;i<nums.length;i++){
            q.add(nums[i]);
        }
        this.k = k;
    }
    
    public int add(int val) {
        q.add(val);
        while(q.size()>k) q.poll();
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */