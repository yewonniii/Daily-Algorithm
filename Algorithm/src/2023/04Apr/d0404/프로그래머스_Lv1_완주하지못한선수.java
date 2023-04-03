import java.util.*;

public class 프로그래머스_Lv1_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> runner = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            runner.put(participant[i], runner.getOrDefault(participant[i], 0) + 1);
        }

        for (String s : completion) {
            runner.put(s, runner.get(s) - 1);
        }

        for (String key : runner.keySet()) {
            if (runner.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}
