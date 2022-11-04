package d1104;

import java.util.*;

public class 프로그래머스_Lv3_여행경로 {
    boolean [] isVisited;
    ArrayList<String> answers;
    
    public String[] solution(String[][] tickets) {
        isVisited = new boolean[tickets.length];
        answers = new ArrayList<String>();
        
        int cnt=0;
        dfs(0,"ICN","ICN",tickets);
        
        Collections.sort(answers);
        
        String[] answer = answers.get(0).split(" ");
        
        return answer;
    }
    
    void dfs(int cnt, String now, String answer, String[][] tickets){
        if(cnt==tickets.length){
            answers.add(answer);
            return;
        }
        
        for(int i=0; i<tickets.length; i++){
            if(!isVisited[i] && tickets[i][0].equals(now)){
                isVisited[i] = true;
                dfs(cnt+1, tickets[i][1],answer+" "+tickets[i][1],tickets);
                isVisited[i]=false;
            }
        }
        return;
    }

}
