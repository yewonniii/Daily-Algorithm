import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260_DFS와BFS {
    static int N, M, V;
    static boolean[] isVisited;
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        isVisited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        dfs(V, isVisited);
        System.out.println();
        isVisited[0] = true;
        bfs(V);

    }

    private static void bfs(int start) {
        Queue<Integer> que = new LinkedList<Integer>();
        boolean[] isVisited = new boolean[N + 1];

        que.offer(start);
        isVisited[start] = true;

        while (!que.isEmpty()) {
            int cur = que.poll();

            System.out.print(cur + " ");

            for (int i = 0; i < N + 1; i++) {
                if (!isVisited[i] && graph[cur][i] == 1) {
                    que.offer(i);
                    isVisited[i] = true;
                }
            }
        }

    }

    private static void dfs(int start, boolean[] isVisited) {
        isVisited[start] = true;
        System.out.print(start + " ");

        for (int i = 0; i < N + 1; i++) {
            if (!isVisited[i] && graph[start][i] == 1) {
                isVisited[i] = true;
                dfs(i, isVisited);
            }
        }

    }
}
