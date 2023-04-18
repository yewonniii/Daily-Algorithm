import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2985_롤케이크 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine()); // 롤케이크의 길이
        int N = Integer.parseInt(br.readLine()); // 방청객의 수

        int[] cakes = new int[L + 1]; // 0~10
        int[] fake = new int[N + 1];
        int[] real = new int[N + 1];

        int ans1 = 0, ans2 = 0;
        int idx1 = 0, idx2 = 0;

        for (int i = 1; i < N + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            fake[i] = K - P + 1;

            for (int n = P; n <= K; n++) {
                if (cakes[n] == 0)
                    cakes[n] = i;
            }
        }

        for (int i = 1; i < L + 1; i++) {
            if (cakes[i] != 0) {
                ++real[cakes[i]];
            }

        }
        for (int i = 1; i < N + 1; i++) {
            if (fake[i] > ans1) {
                ans1 = fake[i];
                idx1 = i;
            }
            if (real[i] > ans2) {
                ans2 = real[i];
                idx2 = i;
            }

        }
        System.out.println(idx1);
        System.out.println(idx2);

    }
}
