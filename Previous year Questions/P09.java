import java.util.*;

public class P09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 2 == 1) {
            fibo((n / 2) + 1);
        } else
            prime(n / 2);
    }

    public static void fibo(int n) {
        int a = 0, b = 1, next;

        for (int i = 1; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println(a);

    }

    public static void prime(int n) {
        int c = 0, f = 0;
        for (int i = 1; i <= n; i++) {
            c = 0;
            for (int j = 2; j <= i / 2; i++) {
                if (i % j == 0) {
                    c++;
                }

            }
            if (c == 0) {
                // if found the nth prime number
                if (++f == n) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
