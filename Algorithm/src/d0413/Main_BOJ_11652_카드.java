package d0413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_BOJ_11652_카드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] nums = new long[N];
		
		for (int i = 0; i < N; i++) {
			nums[i]=Long.parseLong(br.readLine()) ; 
		}

		Arrays.sort(nums);
		
		int cnt=1, max =1, maxIdx=0;
		
		for (int i = 1; i < N; i++) {
			if(nums[i]==nums[i-1]) cnt++;
			else cnt=1;
			
			if(cnt>max) {
				max=cnt;
				maxIdx=i;
			}
		}

		System.out.println(nums[maxIdx]);

	}

}
