package d1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

//add,poll,isEmpty
public class boj_1966_프린터큐 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); //문서의 개수
			int M = Integer.parseInt(st.nextToken()); //몇번쨰로 인쇄되었는지 궁금한 문서의 현재 위치
			
			LinkedList<int[]> imports = new LinkedList<int[]>();
		
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i <N; i++) {
				imports.add(new int[] {i,Integer.parseInt(st.nextToken())});
			}
			
			int cnt =0;
			
			while(!imports.isEmpty()) {
				int[] cur = imports.poll();
			
				boolean isPrint = true;
				
				for (int [] que : imports) {
					if(que[1]>cur[1]) {
						System.out.println(que[0]+" "+cur[0]);
						System.out.println(que[1]+" "+cur[1]);
						isPrint = false;
					}
				}
				
				if(isPrint) {
					cnt++;
					if(cur[0]==M) break;
				}else {
					imports.add(cur);
				}
			}
//			System.out.println(cnt);
		}//tc

	}

}
