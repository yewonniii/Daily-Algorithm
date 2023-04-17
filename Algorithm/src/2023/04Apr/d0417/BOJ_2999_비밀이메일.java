import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2999_비밀이메일 {
    static int R, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            if (len % i == 0 && i <= len / i) {
                R = i;
                C = len / i;
            }
        }

        char[][] msg = new char[R][C];
        int idx = 0;

        for (int r = 0; r < C; r++) {
            for (int c = 0; c < R; c++) {
                msg[c][r] = arr[idx++];
            }
        }

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                System.out.print(msg[r][c]);
            }
        }

    }
}
