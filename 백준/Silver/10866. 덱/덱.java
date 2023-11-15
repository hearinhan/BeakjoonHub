import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i <num; i++) {
            String cmd = br.readLine();
            int cNum = 0;

            if (cmd.startsWith("push_front")) {
                cNum = Integer.parseInt(cmd.split(" ")[1]);
                dq.offerFirst(cNum);
            } else if (cmd.startsWith("push_back")) {
                cNum = Integer.parseInt(cmd.split(" ")[1]);
                dq.offerLast(cNum);
            } else if (cmd.equals("pop_front")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");    
                } else {
                    bw.write(dq.pollFirst() + "\n");
                }
            } else if (cmd.equals("pop_back")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dq.pollLast() + "\n");
                }
            } else if (cmd.equals("size")) {
                bw.write(dq.size() + "\n");
            } else if (cmd.equals("empty")) {
                if (dq.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (cmd.equals("front")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dq.getFirst() + "\n");
                }
            } else if (cmd.equals("back")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dq.getLast() + "\n");
                }
            }
        }
        bw.flush();
    }
}
