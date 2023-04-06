import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BOJ_1302_베스트셀러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> books = new HashMap<>();

        int max = 0;
        for (int i = 0; i < N; i++) {
            String book = br.readLine();
            books.put(book, books.getOrDefault(book, 0) + 1);
            max = Math.max(max, books.get(book));
        }

        ArrayList<String> list = new ArrayList<>(books.keySet());
        Collections.sort(list);

        for (String str : list) {
            if (books.get(str) == max) {
                System.out.println(str);
                break;
            }
        }

    }
}
