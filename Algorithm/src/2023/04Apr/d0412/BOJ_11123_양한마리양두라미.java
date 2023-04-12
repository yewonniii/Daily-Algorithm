import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11123_양한마리양두라미 {
    static boolean[][] isVisited;
    static char[][] map;
    static int H, W, cnt;

    // 상우하좌
    static int[] dr = { 1, 0, -1, 0 };
    static int[] dc = { 0, 1, 0, -1 };

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 테스트케이스 시작
        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            isVisited = new boolean[H][W];
            map = new char[H][W];

            for (int r = 0; r < H; r++) {
                String str = br.readLine();
                for (int c = 0; c < W; c++) {
                    map[r][c] = str.charAt(c);
                }
            }

            cnt = 0;

            for (int r = 0; r < H; r++) {
                for (int c = 0; c < W; c++) {
                    if (map[r][c] == '#') {
                        cnt++;
                        dfs(r, c);
                    }
                }
            }

            System.out.println(cnt);

        }

    }

    private static void dfs(int r, int c) {
        map[r][c] = '.';
        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (isIn(nr, nc) && map[nr][nc] == '#') {
                dfs(nr, nc);
            }
        }
        return;
    }

    private static boolean isIn(int nr, int nc) {
        return nr >= 0 && nr < H && nc >= 0 && nc < W;
    }
}
