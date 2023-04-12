import java.util.*;

public class 프로그래머스_Lv2_모의고사 {
    public int[] solution(int[] answers) {
        int[] num1 = { 1, 2, 3, 4, 5 };
        int[] num2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] num3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int cnt1 = 0, cnt2 = 0, cnt3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i % num1.length])
                cnt1++;
            if (answers[i] == num2[i % num2.length])
                cnt2++;
            if (answers[i] == num3[i % num3.length])
                cnt3++;
        }

        int max = Math.max(cnt3, Math.max(cnt1, cnt2));

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (max == cnt1)
            list.add(1);
        if (max == cnt2)
            list.add(2);
        if (max == cnt3)
            list.add(3);

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
