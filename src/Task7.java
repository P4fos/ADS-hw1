public class Task7 {
    public static void solve(int[][] mat, int r1, int c1, int r2, int c2, int num) {
        if (r1 > r2 || c1 > c2) return;

        for (int i = c1; i <= c2; i++) mat[r1][i] = num++;

        for (int i = r1 + 1; i <= r2; i++) mat[i][c2] = num++;

        if (r1 < r2 && c1 < c2) {

            for (int i = c2 - 1; i >= c1; i--) mat[r2][i] = num++;

            for (int i = r2 - 1; i > r1; i--) mat[i][c1] = num++;
        }
        solve(mat, r1 + 1, c1 + 1, r2 - 1, c2 - 1, num);
    }
}