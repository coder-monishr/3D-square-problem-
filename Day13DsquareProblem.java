import java.util.Scanner;

public class Day13DsquareProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m (rows): ");
        int m = sc.nextInt();
        System.out.print("Enter n (columns): ");
        int n = sc.nextInt();

        int totalSquares = countSquares(m, n);
        System.out.println("Total number of squares: " + totalSquares);
        sc.close();
    }
    public static int countSquares(int m, int n) {
        int count = 0;
        int min = Math.min(m, n);
        for (int size = 1; size <= min; size++) {
            count += (m - size + 1) * (n - size + 1);
        }
        return count;
    }
}