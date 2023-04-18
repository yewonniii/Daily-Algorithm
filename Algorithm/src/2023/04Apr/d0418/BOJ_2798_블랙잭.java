import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798_블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int ans = 0;
        int[] cards = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());

        }

        for (int n1 = 0; n1 < N - 2; n1++) {
            for (int n2 = n1 + 1; n2 < N - 1; n2++) {
                for (int n3 = n2 + 1; n3 < N; n3++) {
                    int sum = cards[n1] + cards[n2] + cards[n3];

                    if (sum <= M)
                        ans = Math.max(ans, sum);
                }
            }
        }

        System.out.println(ans);

    }
}
