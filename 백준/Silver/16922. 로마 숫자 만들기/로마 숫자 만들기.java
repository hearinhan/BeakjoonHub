import java.util.Scanner;

public class Main {
    static int n;
    static int[] numbers = {1, 5, 10, 50};
    static int[] select;
    static boolean[] visited;
    static int result;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        select = new int[n];
        visited = new boolean[50*n+1];
        result = 0;

        dfs(n, 0, 0);
        System.out.println(result);
    }
    public static void dfs(int n, int sum, int index) {
        if (n==0) {
            if (!visited[sum]) {
                result++;
                visited[sum] = true;
            }
            return;
        }
        for (int i = index; i < 4; i++) {
            dfs(n-1, sum+numbers[i], i);
        }
    }
}
