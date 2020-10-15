import java.util.*;

public class P03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        long s = 0, c = 0;
        for (int i = 0; i < n.length(); i++) {
            if (i % 2 == 0) {
                s += n.charAt(i) - '0';
            } else {
                c += n.charAt(i) - '0';
            }
        }
        System.out.println(Math.abs(s - c));

    }
}
