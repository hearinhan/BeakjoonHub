import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. 입력
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 

        int P[] = new int[N];
        for (int i=0; i<N; i++) {
            P[i] = sc.nextInt();
        } 

        // 2. 로직 : 그리디 알고리즘
        int minute = 0; 
        int result = 0; 

        Arrays.sort(P); 

        for (int i=0; i<N; i++) {
            minute += P[i];
            result += minute;
        }

        // 3. 출력
        System.out.println(result);
    }
}