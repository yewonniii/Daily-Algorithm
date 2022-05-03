package d0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main_BOJ_1476_날짜계산 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int e=1,s=1,m=1;
		
		int E = Integer.parseInt(st.nextToken()); //1~15
		int S = Integer.parseInt(st.nextToken()); //1~28
		int M = Integer.parseInt(st.nextToken()); //1~19
		
		for (int y = 1; ; y++) {
			if(e==E && s==S && m==M) {
				System.out.println(y);
				break;
			}
			
			e+=1;
			s+=1;
			m+=1;
			
			if(e==16) {
				e=1;
			}
			if(s==29) {
				s=1;
			}
			if(m==20) {
				m=1;
			}
		}
		
	}

}
