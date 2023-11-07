import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); //472
        String n2 = sc.next(); //385

        String reverse = new StringBuilder(n2).reverse().toString();

        for (int i = 0; i < reverse.length(); i++) {
            int divN2 = reverse.charAt(i)-48;

            System.out.println(n1*divN2);
        }
        System.out.println(n1*Integer.parseInt(n2));
    }
}