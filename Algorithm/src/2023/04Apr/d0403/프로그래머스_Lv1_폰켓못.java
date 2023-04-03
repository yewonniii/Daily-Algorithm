import java.util.*;

public class 프로그래머스_Lv1_폰켓못 {
    public int solution(int[] nums) {
        int answer = 0;
        int center = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() >= center)
            answer = center;
        else
            answer = set.size();

        return answer;
    }
}
