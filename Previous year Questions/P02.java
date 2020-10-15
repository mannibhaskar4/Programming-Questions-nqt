import java.util.*;

//This problem can be solved using switch case but for convinence I am solving it using hash map
public class P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        hmap.put('A', 10);
        hmap.put('B', 11);
        hmap.put('C', 12);
        hmap.put('D', 13);
        hmap.put('E', 14);
        hmap.put('F', 15);
        hmap.put('G', 16);
        hmap.put('a', 10);
        hmap.put('b', 11);
        hmap.put('c', 12);
        hmap.put('d', 13);
        hmap.put('e', 14);
        hmap.put('f', 15);
        hmap.put('g', 16);

        long s = 0;
        int k = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            if ((n.charAt(i) >= 'A' && n.charAt(i) <= 'Z') || (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')) {
                s += hmap.get(n.charAt(i)) * (int) (Math.pow(17, k));
                k++;
            } else {
                s += (n.charAt(i) - '0') * (int) (Math.pow(17, k));
                k++;
            }
        }
        System.out.println(s);

    }
}
