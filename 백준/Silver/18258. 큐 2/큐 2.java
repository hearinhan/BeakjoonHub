import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        int last = 0;

        for (int i = 0; i < num; i++) {
            // 두번째 줄 : 명령어
            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]) {
                case "push":
                    int cNum = Integer.parseInt(cmd[1]);
                    q.add(cNum);
                    last = cNum;
                    break;

                case "pop":
                    if (!q.isEmpty()) {
                        bw.write(q.poll() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;

                case "size":
                    bw.write(q.size() + "\n");
                    break;

                case "empty":
                    if (!q.isEmpty()) {
                        bw.write("0\n");
                    } else {
                        bw.write("1\n");
                    }
                    break;

                case "front":
                    if (!q.isEmpty()) {
                        bw.write(q.peek() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;

                case "back":
                    if (!q.isEmpty()) {
                        bw.write(last + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
            }
        }
        bw.flush();
    }
}
