package d0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BOJ_3273_두수의합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] nums = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i]=Integer.parseInt(st.nextToken());
		}
		
		int X = Integer.parseInt(br.readLine());
		
		Arrays.sort(nums);
		
		int ans = 0;
		int start=0, end=N-1;
		int sum =0;
		
		while(start<end) {
			sum = nums[start]+nums[end];
			
			if(sum==X) ans++;
			
			if(sum <= X) {
				start++;
			}else {
				end--;
			}
		}
		
		System.out.println(ans);
	}

}
