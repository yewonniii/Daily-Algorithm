import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1592_영식이와친구들 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] friends = new int[N + 1];

        int idx = 1, ans = 0;
        friends[1] = 1;

        while (true) {
            if (friends[idx] == M)
                break;

            if (friends[idx] % 2 == 1) {
                idx = idx + L;
            } else {
                idx = idx - L;
            }

            if (idx > N) {
                idx = idx % N;
            } else if (idx < 1) {
                idx = idx + N;
            }

            friends[idx]++;
            ans++;
        }
        System.out.println(ans);
    }
}
