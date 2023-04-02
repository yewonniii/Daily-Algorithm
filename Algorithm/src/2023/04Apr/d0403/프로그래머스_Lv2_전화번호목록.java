import java.util.*;

public class 프로그래머스_Lv2_전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], "prefix");
        }

        for (String str : phone_book) {
            for (int i = 1; i < str.length(); i++) {
                if (map.containsKey(str.substring(0, i)))
                    return false;
            }
        }
        return answer;
    }
}
