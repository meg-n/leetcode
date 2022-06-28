class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      // Arrays.sot(piles);
        int l = 1, r =1;
        for(int pile : piles){
            r = Math.max(r, pile);
        }
        while(l<r){
            int mid = l + (r-l)/2;
            int hoursSpent = 0;
            for(int pile : piles){
                hoursSpent += Math.ceil((double)pile/mid);
            }
            if(hoursSpent<= h){
                r = mid;
            }
            else 
                l = mid+1;
        }
        return r;
    }
}