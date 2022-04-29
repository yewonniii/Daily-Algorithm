package d0429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main_BOJ_13410_거꾸로구구단 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int max =0;
		
		for (int i = 1; i < K; i++) {
			int temp = N*i;
			String str = String.valueOf(temp);
			StringBuilder sb = new StringBuilder();
			
			for (int j = str.length()-1; j >=0; j--) {
				sb.append(str.charAt(j));
			}

			max = Math.max(max, Integer.parseInt(sb.toString()));
		}
		
		System.out.println(max);
	}

}
