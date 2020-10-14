import java.util.*;

public class Q03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0, a = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                a = (int) (Math.pow(2, j));
            } else {
                a = (int) (Math.pow(3, j));
                j++;
            }
            // System.out.print(a + " ");
        }
        System.out.println(a);
        sc.close();
    }
}
