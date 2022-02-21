package ArrayProbs;

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n % 2 != 0) {
            int x = n / 2;
            return (x * x) + 2;
        } else {
            return n / 2;
        }
    }
}
