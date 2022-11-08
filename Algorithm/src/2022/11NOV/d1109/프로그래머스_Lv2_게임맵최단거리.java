package d1109;

import java.util.*;

public class 프로그래머스_Lv2_게임맵최단거리 {
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    boolean[][] visited;
    int n,m;
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        
        visited = new boolean[n][m];
        return bfs(0,0,maps);
    }
    
    public int bfs(int x, int y, int[][] maps){
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(x,y,1));
        visited[x][y] = true; //방문하면 1로 표시
        
        while(!que.isEmpty()){
            Node node = que.poll();
            
            if(node.x == n-1 && node.y == m-1) return node.cost; //목적지에 도착
            
            for(int i=0; i<4; i++){
                int nx = node.x+dx[i];
                int ny = node.y+dy[i];

                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(!visited[nx][ny] && maps[nx][ny]==1){
                    visited[nx][ny]=true;
                    que.add(new Node(nx,ny,node.cost+1));
                }
                }

            }
        }
        return -1;
    }
    
    public class Node{
        int x;
        int y;
        int cost;
        
        public Node(int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
}
}
