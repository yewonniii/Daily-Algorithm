import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941_크로아티아알파벳 {
    static String[] cro = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < cro.length; i++) {
            if (str.contains(cro[i])) {
                str = str.replace(cro[i], " ");
            }
        }

        System.out.println(str.length());

    }

}
