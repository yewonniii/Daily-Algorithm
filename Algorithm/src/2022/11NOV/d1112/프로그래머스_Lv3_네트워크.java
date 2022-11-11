package d1112;

public class 프로그래머스_Lv3_네트워크 {

    static int[][] graph;
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(computers, i, visited);
                answer++;
            }
        }
        return answer;
    }
    
    boolean[] dfs(int [][] computers, int i, boolean[] visited){
        visited[i]=true;
        
        for(int j=0; j<computers.length; j++){
            if(i != j && computers[i][j]==1 && visited[j]==false){
                visited = dfs(computers,j, visited);
            }
        }
        return visited;
    }
}
