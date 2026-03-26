public class Task4 {
    public static double solve(double b, int n) {
        if (n == 0) return 1;
        return Math.pow(b, n) + solve(b, n - 1);
    }
}