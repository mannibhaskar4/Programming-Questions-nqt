import java.util.*;

public class P07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        a = a.replaceAll("a", "*");
        a = a.replaceAll("e", "*");
        a = a.replaceAll("i", "*");
        a = a.replaceAll("o", "*");
        a = a.replaceAll("u", "*");
        a = a.replaceAll("A", "*");
        a = a.replaceAll("E", "*");
        a = a.replaceAll("I", "*");
        a = a.replaceAll("O", "*");
        a = a.replaceAll("U", "*");

        System.out.println(a);

        String x = "";
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != 'a' && b.charAt(i) != 'e' && b.charAt(i) != 'i' && b.charAt(i) != 'o'
                    && b.charAt(i) != 'u' && b.charAt(i) != 'A' && b.charAt(i) != 'E' && b.charAt(i) != 'I'
                    && b.charAt(i) != 'O' && b.charAt(i) != 'U') {
                // b = b.replace(b.charAt(i), '#');
                x = x + '@';
            } else {
                x = x + b.charAt(i);
            }
        }

        System.out.println(x);

        c = c.toUpperCase();
        System.out.println(c);

        System.out.println(a + x + c);
    }
}
