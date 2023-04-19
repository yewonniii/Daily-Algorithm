import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3052_나머지 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[43];

        for (int i = 0; i < 10; i++) {
            nums[Integer.parseInt(br.readLine()) % 42]++;
        }

        int ans = 0;
        for (int i = 0; i < 43; i++) {
            if (nums[i] != 0)
                ans++;
        }

        System.out.println(ans);
    }
}
