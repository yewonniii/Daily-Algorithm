import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_24482_깊이우선탐색4 {
    static ArrayList<ArrayList<Integer>> graph;
    static int N, M, R;
    static boolean[] isCheck;
    static int[] depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        isCheck = new boolean[N + 1];
        depth = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
            graph.get(end).add(start); // 양방향
        }

        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        isCheck[R] = true;
        depth[R] = 0;
        dfs(R);

        for (int i = 0; i < isCheck.length; i++) {
            if (!isCheck[i])
                depth[i] = -1;
        }

        for (int i = 1; i < depth.length; i++) {
            System.out.println(depth[i]);
        }
    }

    private static void dfs(int R) {
        for (int num : graph.get(R)) {
            if (!isCheck[num]) {
                isCheck[num] = true;
                depth[num] = depth[R] + 1;
                dfs(num);
            }
        }

    }

}
