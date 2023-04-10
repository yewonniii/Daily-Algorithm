import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_5568_카드놓기 {
    static int n, k;
    static int[] num, arr;
    static boolean[] isSelected;
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        num = new int[n];
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        isSelected = new boolean[n];

        dfs(0);
        System.out.println(set.size());
    }

    private static void dfs(int depth) {
        if (depth == k) {
            String str = "";
            for (int i = 0; i < arr.length; i++) {
                str += arr[i];
            }
            set.add(str);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isSelected[i] == false) { // 선택되지 않았으면
                isSelected[i] = true; // 선택해주고
                arr[depth] = num[i];
                dfs(depth + 1);
                isSelected[i] = false;
            }
        }

    }
}
