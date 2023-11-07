import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (45<=m && m<=59) {
            if (1<=h && h <=23) {
                System.out.println(h + " " + (m-45));
            } else if (h == 0) {
                System.out.println(0 + " " + (m-45));
            }
        } else if (0<=m && m<=44) {
            if (1<=h && h <=23) {
                System.out.println((h-1) + " " + (m+15));
            } else if (h == 0) {
                System.out.println(23 + " " + (m+15));
            }
        }
    }
}