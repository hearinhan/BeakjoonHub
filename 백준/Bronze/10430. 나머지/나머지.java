import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int res1 = (A+B)%C;
        int res2 = ((A%C) + (B%C))%C;
        int res3 = (A*B)%C;
        int res4 = ((A%C) * (B%C))%C;

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

    }
}