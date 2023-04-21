import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10157_자리배정 {
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 }; // 상우하좌

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine()); // 어떤 관객의 대기번호

        int[][] map = new int[R + 2][C + 2];

        for (int i = 0; i < C + 2; i++) {
            map[0][i] = -1;
            map[R + 1][i] = -1;
        }

        for (int i = 0; i < R + 2; i++) {
            map[i][0] = -1;
            map[i][C + 1] = -1;
        }

        if (K > C * R) {
            System.out.println(0);
            return;
        }

        int x = R, y = 1; // 현재 좌석 위치 (R,1)
        int seat = 1;
        int dir = 0; // (0123 상우하좌)

        while (true) {
            map[x][y] = seat;

            if (seat == K) {
                System.out.println(y + " " + (R - x + 1));
                break;
            }

            if (map[x + dx[dir]][y + dy[dir]] != 0) {
                dir = (dir + 1) % 4;
            }

            x = x + dx[dir];
            y = y + dy[dir];

            seat++;

            if (seat > C * R)
                break;
        }

    }
}
