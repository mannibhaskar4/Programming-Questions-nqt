import java.util.*;

public class P04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a[] = { "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map",
                "range", "return", "struct", "type", "var" };

        int k = 0;

        String keyword = sc.nextLine();

        for (int i = 0; i < a.length; i++) {
            if (keyword.equals(a[i])) {
                k = 1;
                break;
            }
        }
        System.out.println(keyword + ((k == 1) ? " is a keyword" : " is not a keyword"));

    }

}
