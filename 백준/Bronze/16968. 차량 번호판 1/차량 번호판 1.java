import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char cmd[] = br.readLine().toCharArray();
        int finalComNumber = 1;

        for (int i = 0; i < cmd.length; i++) {
            // c, d 한 글자씩 받는 경우
            if (i == 0) {
                if (cmd[i]=='c') {
                    // c인 경우 -> 26개(a~z)
                    finalComNumber = finalComNumber * 26;
                } else {
                    // d인 경우 -> 10개(0~9)
                    finalComNumber = finalComNumber * 10;
                }
            }
            // 두글 자 이상 받는 경우
            else {
                if (cmd[i] == cmd[i - 1]) {
                    // cc, dd, ccc, ddd, ccd, ddc... 처럼 연속 글자들의 경우 제외(26가지-1, 10가지-1)
                    if (cmd[i] == 'c') {
                        finalComNumber = finalComNumber * 25;
                    } else {
                        finalComNumber = finalComNumber * 9;
                    }
                } else {
                    if (cmd[i] == 'c') {
                        finalComNumber = finalComNumber * 26;
                    } else {
                        finalComNumber = finalComNumber * 10;
                    }
                }
            }
        }
        System.out.println(finalComNumber);
    }
}