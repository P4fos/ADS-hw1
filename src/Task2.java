public class Task2 {
    public static int solve(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + solve(arr, n - 1);
    }
}