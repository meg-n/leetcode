class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int right = (m * n) -1;
        
        while(left<=right){
            int pivot = left + (right-left)/2;
            if(matrix[pivot/n][pivot%n] == target)return true;
            else if(matrix[pivot/n][pivot%n]> target ){
                right = pivot-1;
            }else{
                left = pivot+1;
            }
        }
        return false;
    }
}