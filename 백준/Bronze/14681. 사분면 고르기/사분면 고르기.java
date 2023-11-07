import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (0<x && x<=1000) {
            if (0<y && y<=1000) {
                System.out.println("1");
            } else if (-1000<=y && y<0) {
                System.out.println("4");
            }
        } else if (-1000<=x && x<0) {
            if (0<y && y<=1000) {
                System.out.println("2");
            } else if (-1000<=y && y<0) {
                System.out.println("3");
            }
        }
    }

}