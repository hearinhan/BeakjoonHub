import java.util.*;
import java.io.*;

public class Main {
    private static int N, K;
    private static String[] SelectCard;
    private static HashSet<String> hs = new HashSet<>();
    private static boolean[] visited;

    // 재귀함수 이용
    private static void dfs (int selNum, String selChar) {
        if (selNum == K) {
            hs.add(selChar);
            return;
        }
            for (int i=0; i<N; i++) {
                if (visited[i]) continue;
                visited[i] = true;
                dfs(selNum+1, selChar+SelectCard[i]);
                visited[i] = false;
            }

    }

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        SelectCard = new String[N];
        visited = new boolean[N];

        // 1. 카드 뽑기
        for (int i=0; i<N; i++) {
            SelectCard[i] = br.readLine();
        }

        // 2. 재귀 함수 + Hash 함수
        dfs(0, "");

        // 출력
        System.out.println(hs.size());

        bw.close();
        br.close();
    }
}
