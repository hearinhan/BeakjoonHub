import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;

        if (a==b && b==c) {
            result = 10000 + (a*1000);
        } else if ((a == b && a != c && b != c)) {
            result = 1000 + (a*100);
        } else if ((b == c && b != a && c != a)) {
            result = 1000 + (b*100);
        } else if ((c == a && c != b && a != b)) {
            result = 1000 + (c*100);
        } else if (c != b && a != c && b != c) {
            if (a>b && a>c) {
                result = a*100;
            } else if (b>c && b>a) {
                result = b*100;
            } else if (c>a && c>b) {
                result = c*100;
            }
        }

        System.out.println(result);
    }
}