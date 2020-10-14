//to know the entered string is a keyword

import java.util.*;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        String n = sc.nextLine();
        String keyword[] = { "abstract", "boolean", "break", "byte", "case", "catch", "char", "class", "continue",
                "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "if",
                "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "private",
                "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized",
                "this", "throw", "throws", "transient", "try", "void", "volatile", "while" };
        for (int i = 0; i < keyword.length; i++) {
            if (keyword[i].equalsIgnoreCase(n)) {
                System.out.println("True");
                c = false;
                break;
            }
        }
        if (c) {
            System.out.println("False");
        }

        sc.close();
    }
}