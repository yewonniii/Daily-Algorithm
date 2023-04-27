import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2775_부녀회장이될테야 {

    static int[][] APT = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        make_APT();
        for (int tc = 0; tc < T; tc++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(APT[k][n]);
        } // tc

    }

    private static void make_APT() {
        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1;
            APT[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }

    }
}