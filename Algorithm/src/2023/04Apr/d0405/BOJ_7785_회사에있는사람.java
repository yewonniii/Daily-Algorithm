import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BOJ_7785_회사에있는사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] log = br.readLine().split(" ");

            if (log[1].equals("enter")) {
                map.put(log[0], "enter");
            }

            if (map.size() != 0) {
                if (log[1].equals("leave")) {
                    map.remove(log[0]);
                }
            }
        }
        ArrayList<String> list = new ArrayList<String>(map.keySet());

        Collections.sort(list, Collections.reverseOrder());

        for (var key : list) {
            System.out.println(key);
        }

    }
}
