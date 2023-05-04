import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_7568_덩치 {
    static int rank;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] people = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            people[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            people[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        for (int i = 0; i < N; i++) {
            rank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }

    }
}
