package d0502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_2003_수들의합2 {

	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int [] nums = new int [N];
		
		for (int i = 0; i < N; i++) {
			nums[i]=Integer.parseInt(st.nextToken());
		}
		
		int cnt =0;
		
		int start = 0;
		int end = 0;
		
		int sum =0;
		
		for (int i = start; i <= end; i++) {
			sum += nums[i];
		}
		
		for(int i=0; ; i++) {
			try{
				if(sum==M) {
					cnt++;
					sum = sum +nums[++end]-nums[start++];
				}else if (sum < M) {
					sum += nums[++end];
				}else {	
					sum -= nums[start];
					start++;
				}
			} catch(Exception e) {
				break;
			}
				
		}
		System.out.println(cnt);
	}
}
