package d1014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_2563_색종이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //색종이 수
		
		int [][] arr = new int[100][100];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for (int w = x; w < x+10; w++) {
				for (int h = y; h <y+10; h++) {
					arr[w][h]=1;
				}
			}
		}
		
		int ans = 0;
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(arr[i][j]==1) ans++;
			}
		}
		
		System.out.println(ans);
		
		
	}

}
