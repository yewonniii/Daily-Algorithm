package d1026;

import java.util.*;

public class 프로그래머스_Lv1_예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int len = d.length;
        int sum = 0;
        
        Arrays.sort(d);
        
        for(int i=0; i<len; i++){
            sum+=d[i];
            if(sum > budget){
                answer=i;
                break;
            }
        }
        if(sum <= budget){
            answer = d.length;
        }
        
        return answer;
    }
}
