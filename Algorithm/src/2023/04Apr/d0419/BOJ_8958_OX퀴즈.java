import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8958_OX퀴즈 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int t = 0; t < tc; t++) {
            String quiz = br.readLine();

            int cnt = 0, sum = 0;
            for (int i = 0; i < quiz.length(); i++) {
                char res = quiz.charAt(i);

                if (res == 'O')
                    cnt++;
                else
                    cnt = 0;

                sum += cnt;

            }
            System.out.println(sum);
        }
    }
}
