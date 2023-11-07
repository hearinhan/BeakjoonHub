import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] parents;
    static boolean[] visited;
    static ArrayList<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        parents = new int[n+1];
        visited = new boolean[n+1];
        list = new ArrayList[n+1];

        for (int i =1; i <= n; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pa = Integer.parseInt(st.nextToken());
            int no  = Integer.parseInt(st.nextToken());
            list[pa].add(no);
            list[no].add(pa);
        }

        dfs(1);

        for (int i = 2; i <= n; i++) { 
            System.out.println(parents[i]);
        }
    }

    private static void dfs(int v) {
        visited[v] = true;

        for (int ver: list[v]) {
            if (!visited[ver]) {
                parents [ver] = v;
                dfs(ver);
            }
        }
    }
}