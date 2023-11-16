import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cmd = br.readLine();
        int n = Integer.parseInt(cmd.split(" ")[0]); // 노드 개수
        int m = Integer.parseInt(cmd.split(" ")[1]); // 간선 개수
        int v = Integer.parseInt(cmd.split(" ")[2]); // 루트 노드

        list = new ArrayList[n]; // 특정 노드에 연결된 애들

        for (int i =0; i < n; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            String con = br.readLine();
            int fir = Integer.parseInt(con.split(" ")[0]);
            int sec = Integer.parseInt(con.split(" ")[1]);

            list[fir-1].add(sec); // 단방향 연결
            list[sec-1].add(fir); // 단 -> 양방향 연결로 만듬
        }
        
        // [추가] 리스트 작은 수 부터 나오게 정렬
        for (int i = 0; i < n; i++) {
            Collections.sort(list[i]);
        }

        dfs(v, new boolean[n]);
        System.out.println(); // 줄바꿈
        bfs(v, n);

    }
    private static void dfs(int rNode, boolean[] visited) {
        // 깊이 탐색
        if (visited[rNode-1]) { // 이미 방문한 노드라면 더 이상 탐색하지 않고 함수 종료
            return;
        }

        visited[rNode-1] = true; // 방문하지 않은 노드라면 true로 표시하여 방문했다고 표시
        System.out.print(rNode + " "); // 방문한 노드 출력

        for (int near : list[rNode-1]) { // 이웃 노드들을 탐색하여 재귀함수로 탐색
            dfs(near, visited);
        }
    }
    private static void  bfs(int rNode, int totalNode) {
        // 넓이 탐색
        boolean[] visited = new boolean[totalNode+1]; // 방문여부를 위한 선언
        Queue<Integer> q = new LinkedList<>(); // bfs를 위한 queue 선언

        q.offer(rNode); // 시작 노드를 q에 넣는다.
        visited[rNode] = true; // 방문했다 표시

    while (!q.isEmpty()) { // q가 빌 때까지 반복한다.
        int node = q.poll(); // 노드를 하나 꺼내서 방문함.
        System.out.print(node + " ");

        for (int near : list[node-1]) { // 꺼내진 노드와 연결된 이웃 노드들을 탐색
            if (!visited[near]) { // 만약 방문하지 않은 노드면
                q.offer(near); // 큐에 넣고
                visited[near] = true; // 방문했다 표시한다.
            }
        }
    }
    }
}
