package ArrayProbs;

public class CourePreq {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int[] i : prerequisites){
            for(Integer j: i){

            }
        }
        return true;
    }

    public static void main(String[] args) {
        CourePreq a = new CourePreq();
        int as[][] = new int[2][2];
        boolean val = a.canFinish(2, as);
        System.out.println(val);
    }
}
