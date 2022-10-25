package d1026;

import java.util.*;

public class 프로그래머스_Lv1_두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>(); 
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = new int[set.size()];

        for(int n : set) {
            arr.add(n);
        }
        
        Collections.sort(arr);
        
        int cnt = 0;
        for(int x : arr) {
            answer[cnt] = x;
            cnt++;
        }
        
        return answer;
    }
}
