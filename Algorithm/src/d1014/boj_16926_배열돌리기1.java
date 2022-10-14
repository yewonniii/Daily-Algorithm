package d1014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_16926_배열돌리기1 {

	//우상좌하
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0}; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()); 
		int R = Integer.parseInt(st.nextToken()); //회전의 수
		
		int[][] arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());	
			}
		}
		
		//돌려야 하는 그룹 개수
		int group = Math.min(N, M)/2;
		
		for (int d = 0; d < R; d++) {
			for (int r = 0; r < group; r++) {
				int x = r;
				int y = r;
				
				//각 사각형의 시작지점 
				int value = arr[x][y];
				
				int idx=0;
				
				while(idx<4) {
					int nx = x+dx[idx];
					int ny = y+dy[idx];
					
					if(nx>=r && nx<N-r && ny>=r && ny<M-r) {
						arr[x][y] = arr[nx][ny];
						x=nx;
						y=ny;
					}else {
						idx++;
					}
					
				}
				arr[r+1][r] = value;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <M; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}

}
