public class Task1 {

    public static int solve(int n) {
        if (n <= 1) return 1;
        return (n * n) + solve(n - 1);
    }
}