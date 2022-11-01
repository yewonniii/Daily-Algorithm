package d1101;

import java.util.*;

public class 프로그래머스_Lv1_실패율 {
    public int[] solution(int N, int[] stages) {
        int [] answer = new int[N];
        double [] result = new double[N]; //실패율
        int [] stage = new int [N]; //해당 맵에서 못 벗어난 사람의 수
        int [] sUser = new int [N]; // 해당 맵에 도달한 사람 수
        
        Map hmap = new HashMap();
        
        for(int i=0; i<N; i++){
            stage[i]=0;
            sUser[i]=0;
            for(int j=0; j<stages.length; j++){
                if(i+1 <= stages[j]) sUser[i]++;
                if(i+1 == stages[j]) stage[i]++;
            }
            
            if(stage[i]==0){
                hmap.put(i,0.0);
                result[i]=0.0;
            }else{
                hmap.put(i,(double)stage[i]/(double)sUser[i]);
                result[i] = (double)stage[i]/(double)sUser[i];
            }
        }
        
        Arrays.sort(result);
        
        for(int i=result.length-1; i>=0; i--){
            for(int j=0; j<hmap.size(); j++){
                if(result[i]==(double)hmap.get(j)){
                    answer[Math.abs(i-(result.length-1))] = j+1;
                    hmap.replace(j,-1.0);
                    break;
                }
            }
        }
        
        return answer;
    }
}
