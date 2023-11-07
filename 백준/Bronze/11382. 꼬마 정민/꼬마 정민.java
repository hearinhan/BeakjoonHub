import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        long A = Long.parseLong(st[0]);
        long B = Long.parseLong(st[1]);
        long C = Long.parseLong(st[2]);

        System.out.println(A+B+C);

    }
}