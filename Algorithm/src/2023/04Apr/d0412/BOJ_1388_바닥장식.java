import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1388_바닥장식 {
    static int N, M;
    static char[][] floor;
    static boolean[][] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        floor = new char[N][M];
        isVisited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                floor[i][j] = str.charAt(j);
            }
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (isVisited[i][j])
                    continue; // 방문하지 않은곳이면 계속 진행
                if (floor[i][j] == '-')
                    dfs(i, j, true);
                else
                    dfs(i, j, false);
                cnt++;

            }
        }
        System.out.println(cnt);
    }

    private static void dfs(int i, int j, boolean row) {
        isVisited[i][j] = true; // 방문한걸로 변경
        if (row) { // 세로이면
            j++; // 밑으로 내려가기
            if (j < M && floor[i][j] == '-')
                dfs(i, j, true);
        } else { // 가로이면
            i++;
            if (i < N && floor[i][j] != '-')
                dfs(i, j, false);

        }

    }

}
