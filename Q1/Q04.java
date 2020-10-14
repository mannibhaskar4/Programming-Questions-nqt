import java.util.*;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // if(a[i][j]==)
                a[i][j] = sc.nextInt();
            }
        }
        int max = 0, k = 0, sum = 0;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }

            if (sum > max) {
                max = sum;
                k = i;
            }
            sum = 0;

        }

        for (int j = 0; j < n; j++) {
            // if(a[i][j]==)
            System.out.println(a[k][j]);
        }
        sc.close();
    }
}
