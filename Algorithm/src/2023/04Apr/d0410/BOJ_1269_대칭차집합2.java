import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1269_대칭차집합2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        ArrayList<Integer> AList = new ArrayList<Integer>();
        ArrayList<Integer> BList = new ArrayList<Integer>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            AList.add(Integer.parseInt(st.nextToken()));

        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            BList.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> same = new ArrayList<Integer>();

        for (int a = 0; a < A; a++) {
            for (int b = 0; b < B; b++) {
                if (AList.get(a) == BList.get(b))
                    same.add(AList.get(a));
            }
        }

        for (int i = 0; i < same.size(); i++) {
            if (AList.contains(i))
                AList.remove(i);
            if (BList.contains(i))
                BList.remove(i);
        }

        System.out.println(AList.size() + BList.size());

    }
}
