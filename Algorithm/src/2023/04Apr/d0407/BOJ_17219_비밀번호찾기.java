import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_17219_비밀번호찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> list = new HashMap<String, String>();

        for (int i = 0; i < N; i++) {
            String[] site = br.readLine().split(" ");
            list.put(site[0], site[1]);

        }

        for (int i = 0; i < M; i++) {
            System.out.println(list.get(br.readLine()));
        }

    }
}
