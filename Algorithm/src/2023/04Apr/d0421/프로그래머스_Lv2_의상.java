import java.util.*;

public class 프로그래머스_Lv2_의상 {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> closet = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            if (!closet.containsKey(type)) {
                closet.put(type, 1);
            } else {
                closet.put(type, closet.get(type) + 1);
            }
        }

        Iterator<Integer> it = closet.values().iterator();
        while (it.hasNext()) {
            answer *= it.next().intValue() + 1;

        }

        return answer - 1;
    }
}
