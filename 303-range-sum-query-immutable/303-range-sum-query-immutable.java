class NumArray {
    int[] sum = null;
    public NumArray(int[] nums) {
        sum = nums;
        for(int i=1; i<sum.length; i++){
            sum[i] = nums[i] + sum[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return sum[right];
        return sum[right] - sum[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */