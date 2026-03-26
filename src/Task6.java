import java.util.Scanner;

public class Task6 {
    public static void solve(int n, Scanner sc) {
        if (n <= 0) return;
        char[] str = sc.next().toCharArray();
        solve(n - 1, sc);
        System.out.println(new String(str));
    }
}