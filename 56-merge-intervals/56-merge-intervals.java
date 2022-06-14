class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1,o2) -> o1[0] - o2[0]);
        List<int[]> list = new ArrayList<>();
        
        int start = intervals[0][0], end = intervals[0][1];
        int i=1;
        int e,s;
        
        while(i< intervals.length){
            e = intervals[i][1];
            s = intervals[i][0];
            
            if(s<= end){
                end = Math.max(end, e);
            } else {
                list.add(new int[]{start,end});
                start =s;
                end = e;
            }
            i++;
        }
        list.add(new int[]{start,end});
        
        return list.toArray(new int[list.size()][]);
        
    }
}