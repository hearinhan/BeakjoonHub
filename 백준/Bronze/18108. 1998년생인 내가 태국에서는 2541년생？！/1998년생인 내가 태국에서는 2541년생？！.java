import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);

        int rYear = 0;
        int y = sc1.nextInt();

        if ( (1000 <=  y) && (y <= 3000) ) {
            rYear = y - 543;
            System.out.print(rYear);
        } else {
            System.out.println("범위를 벗어났습니다.");
        }
    }
}