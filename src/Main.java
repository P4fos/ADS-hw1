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
                    System.out.print("Введите n: ");
                    System.out.println("Результат: " + Task1.solve(sc.nextInt()));
                    break;
                case 2:
                    System.out.print("Размер массива: ");
                    int n2 = sc.nextInt();
                    int[] a2 = new int[n2];
                    for(int i=0; i<n2; i++) a2[i] = sc.nextInt();
                    System.out.println("Сумма: " + Task2.solve(a2, n2));
                    break;
                case 3:
                    System.out.print("Введите n: ");
                    System.out.println("Сумма: " + Task3.solve(sc.nextInt()));
                    break;
                case 4:
                    System.out.print("Введите основание b и степень n: ");
                    System.out.println("Результат: " + Task4.solve(sc.nextDouble(), sc.nextInt()));
                    break;
                case 5:
                    System.out.print("Количество элементов N: ");
                    Task5.solve(sc.nextInt(), sc);
                    break;
                case 6:
                    System.out.print("Количество строк N: ");
                    Task6.solve(sc.nextInt(), sc);
                    break;
                case 7:
                    System.out.print("Размер N: ");
                    int n7 = sc.nextInt();
                    int[][] m = new int[n7][n7];
                    Task7.solve(m, 0, 0, n7-1, n7-1, 1);
                    printMatrix(m);
                    break;
                case 8:
                    System.out.print("Введите n и k: ");
                    Task8.solve(sc.nextInt(), sc.nextInt(), "");
                    break;
                case 9:
                    System.out.print("Введите строку: ");
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
                    System.out.println("Неверный номер задачи.");
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