public class Task8 {
    public static void solve(int n, int k, String current) {
        if (n == 0) {
            System.out.println(current);
            return;
        }
        for (int i = 1; i <= k; i++) {
            solve(n - 1, k, current + i);
        }
    }
}