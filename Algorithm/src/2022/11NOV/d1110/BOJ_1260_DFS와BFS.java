package d1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BOJ_1260_DFS와BFS {
	static int N,M,V;
	static boolean[] visited;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); //정점의 개수
		M = Integer.parseInt(st.nextToken()); //간선의 개수
		V = Integer.parseInt(st.nextToken()); //탐색을 시작할 정점 번호 
		
		map = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			map[x][y]=1;
			map[y][x]=1;
		}
		
		dfs(V,visited);
		System.out.println();
		visited[0]=true;
		bfs(V);
		
		

	}

	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] visited = new boolean[N+1];
		
		queue.offer(start); //시작정점
		visited[start]= true;
		
		while(! queue.isEmpty()) {
			int current = queue.poll();
			
			System.out.print(current+" ");
			
			for (int i=0; i<N+1; i++) {
				if(!visited[i] && map[current][i]==1) {
					queue.offer(i); //큐에 넣고 순서를 기다림
					visited[i]=true; //방문처리해줌 -> 중복 방지
				}
			}
		}
		
	}

	private static void dfs(int start, boolean[] visited) {
		visited[start] = true;
		System.out.print(start+" ");
		
		for(int i=0; i<N+1; i++) {
			if(!visited[i] && map[start][i]==1) {
				visited[i]=true;
				dfs(i,visited);
			}
		}
		
	}

}
