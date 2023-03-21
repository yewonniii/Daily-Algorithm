import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10818_최대최소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 정수의 개수 N
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] idx = new int[N];

        for (int i = 0; i < N; i++) {
            idx[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(idx);
        System.out.println(idx[0] + " " + idx[N - 1]);

    }
}
