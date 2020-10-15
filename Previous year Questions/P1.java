import java.util.*;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        getPostion(a);
    }

    public static void getPostion(int a) {
        int d = 10;
        int x = 0, y = 0;
        char ch = 'R';
        while (0 < a) {

            switch (ch) {
                case 'R':
                    x += d;
                    ch = 'U';
                    d += 10;
                    break;
                case 'U':
                    y += d;
                    ch = 'L';
                    d += 10;
                    break;
                case 'L':
                    x -= d;
                    ch = 'D';
                    d += 10;
                    break;
                case 'D':
                    y -= d;
                    ch = 'A';
                    d += 10;
                    break;
                case 'A':
                    x += d;
                    ch = 'R';
                    d += 10;
                    break;
            }

            a--;
        }
        System.out.println(x + " , " + y);
    }
}