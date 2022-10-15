package d1016;

import java.util.*;

public class 프로그래머스_Lv1_K번째수 {

    public int[] solution(int[] array, int[][] commands) {
        int answer[]=new int[commands.length];

        for(int i=0;i<commands.length;i++){
            
            int[] arrs=new int[commands[i][1]-commands[i][0]+1];
            
            int cnt=0;
            for(int j=commands[i][0]-1;j<commands[i][1];j++){
                arrs[cnt++]=array[j];
            }
            
            Arrays.sort(arrs);
            
            answer[i]=arrs[commands[i][2]-1];
        }
        
        return answer;
    }

}
