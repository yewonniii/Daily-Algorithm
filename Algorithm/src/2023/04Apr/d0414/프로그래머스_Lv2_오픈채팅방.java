import java.util.*;

public class 프로그래머스_Lv2_오픈채팅방 {
    public String[] solution(String[] record) {

        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> chatroom = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] chat = record[i].split(" ");

            if (chat[0].equals("Enter")) {
                chatroom.put(chat[1], chat[2]);
                list.add(chat[1] + "님이 들어왔습니다.");
            } else if (chat[0].equals("Change")) {
                chatroom.put(chat[1], chat[2]);
            } else {
                list.add(chat[1] + "님이 나갔습니다.");
            }
        }

        String[] answer = new String[list.size()];

        for (int i = 0; i < answer.length; i++) {
            int idx = list.get(i).indexOf("님");
            String nickname = list.get(i).substring(0, idx);
            String[] commend = list.get(i).split(" ");

            answer[i] = chatroom.get(nickname) + "님이 " + commend[1];
        }

        return answer;
    }
}
