public class Task3 {
    public static int solve(int n) {
        if (n <= 1) return n;
        return n + solve(n - 1);
    }
}