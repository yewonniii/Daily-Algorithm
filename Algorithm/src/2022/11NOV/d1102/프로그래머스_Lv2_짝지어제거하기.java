package d1102;

import java.util.*;

public class 프로그래머스_Lv2_짝지어제거하기 {

    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }

        }
        answer = (stack.size() == 0) ? 1 : 0;

        return answer;
    }
}
