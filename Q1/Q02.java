// In this question user will input no of position on which user want to print number from series
// for ex-  0 0 2 1 4 2 6 3 8 4 10 5 12 6   user input 7 
// ans 6 since position of 6 is 7th in the series

import java.util.*;

public class Q02 {
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
