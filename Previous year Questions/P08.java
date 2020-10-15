import java.util.*;

public class P08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0;
        for (int i = 3; i <= n; i++) {
            if (i % 2 == 1) {
                a += 2;
            } else {
                b += 1;
            }
        }
        if (n % 2 == 1)
            System.out.println(a);
        else
            System.out.println(b);
        sc.close();
    }
}
