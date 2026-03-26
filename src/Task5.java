import java.util.Scanner;

public class Task5 {
    public static void solve(int n, Scanner sc) {
        if (n <= 0) return;
        int current = sc.nextInt();
        solve(n - 1, sc);
        System.out.print(current + " ");
    }
}