import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nВыберите задачу (1-10) или 0 для выхода:");
            int choice = sc.nextInt();
            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.print("input n: ");
                    System.out.println("result: " + Task1.solve(sc.nextInt()));
                    break;
                case 2:
                    System.out.print("Size of the array: ");
                    int n2 = sc.nextInt();
                    int[] a2 = new int[n2];
                    for(int i=0; i<n2; i++) a2[i] = sc.nextInt();
                    System.out.println("Sum: " + Task2.solve(a2, n2));
                    break;
                case 3:
                    System.out.print("Input n: ");
                    System.out.println("Sum: " + Task3.solve(sc.nextInt()));
                    break;
                case 4:
                    System.out.print("Enter the base of b and the degree of n: ");
                    System.out.println("Result: " + Task4.solve(sc.nextDouble(), sc.nextInt()));
                    break;
                case 5:
                    System.out.print("Number of elements N: ");
                    Task5.solve(sc.nextInt(), sc);
                    break;
                case 6:
                    System.out.print("Number of rows N: ");
                    Task6.solve(sc.nextInt(), sc);
                    break;
                case 7:
                    System.out.print("Size of N: ");
                    int n7 = sc.nextInt();
                    int[][] m = new int[n7][n7];
                    Task7.solve(m, 0, 0, n7-1, n7-1, 1);
                    printMatrix(m);
                    break;
                case 8:
                    System.out.print("Input n and k: ");
                    Task8.solve(sc.nextInt(), sc.nextInt(), "");
                    break;
                case 9:
                    System.out.print("Input: ");
                    Task9.solve(sc.next(), "");
                    break;
                case 10:
                    for (int i = 0; i <= 32; i++) {
                        if (Task10.solve(i)) {
                            System.out.println(i + " is a power of two");
                        } else {
                            System.out.println(i + " is not a power of two");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid issue number.");
            }
        }
    }

    private static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }
}