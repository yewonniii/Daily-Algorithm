package d1111;

public class 프로그래머스_Lv3_단어변환 {

    static boolean[] visited;
    static int answer;
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        return answer;
    }
    
    public void dfs(String start, String end, String[] words, int cnt){  
        if(start.equals(end)){
            answer = cnt;
            return;
        }
        
        for(int i=0; i<words.length; i++){
            if(!visited[i] && onlyOneDiff(start,words[i])){
                visited[i]=true;
                dfs(words[i], end, words, cnt+1);
                visited[i]=false;
            }
        }
    }
    
    public boolean onlyOneDiff(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        
        int diffCnt = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)) diffCnt++;
        }
        
        return diffCnt==1;
    }
}
