import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 가격 A =  양념 한마리, B = 후라이드 한마리, C = 반반 한마리
        // 양념 X 마리, 후라이드 Y 마리 구매 -> 반반으로 한마리 만들기 가능

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cmd = br.readLine().split(" ");
        int A = Integer.parseInt(cmd[0]);
        int B = Integer.parseInt(cmd[1]);
        int C = Integer.parseInt(cmd[2]);
        int X = Integer.parseInt(cmd[3]);
        int Y = Integer.parseInt(cmd[4]);

        int result = 0;

        if ((A + B) <= C * 2) {
            result += (A * X) + (B * Y);
        } else {
            if (X > Y) {
                result += Y * (C * 2);
                result += Math.min((X - Y) * A, (X - Y) * (C * 2));
            } else {
                result += X * (C * 2);
                result += Math.min((Y - X) * B, (Y - X) * (C * 2));
            }
        }
        System.out.println(result);
    }
}
