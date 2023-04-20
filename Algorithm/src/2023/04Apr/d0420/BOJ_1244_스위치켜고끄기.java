import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1244_스위치켜고끄기 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] switches = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }

        int Student = Integer.parseInt(br.readLine());

        for (int i = 0; i < Student; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int nums = Integer.parseInt(st.nextToken());

            if (gender == 1) {// 남학생일 경우 - 자기가 받은 수의 배수 스위치 다 바꿈
                int m = nums;
                while (nums <= N) {
                    switches[nums] = switches[nums] == 1 ? 0 : 1;
                    nums += m;
                }
            } else {// 여학생일 경우 - 대칭인 만큼 다 바꿈
                switches[nums] = switches[nums] == 1 ? 0 : 1;

                int temp = 1;

                while (nums + temp <= N && nums - temp > 0) {
                    if (switches[nums + temp] != switches[nums - temp])
                        break;

                    switches[nums + temp] = switches[nums + temp] == 1 ? 0 : 1;
                    switches[nums - temp] = switches[nums - temp] == 1 ? 0 : 1;
                    temp++;

                }
            }
        }

        for (int i = 1; i < N + 1; i++) {
            System.out.print(switches[i] + " ");
            if (i % 20 == 0)
                System.out.println();
        }

    }
}
