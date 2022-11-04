package d0504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BOJ_2470_두용액 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] nums = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.parallelSort(nums);
		
		int start=0, end=N-1;
		int sum , temp;
		int gap = Integer.MAX_VALUE;
		
		int ans1=0, ans2=0;
		
		while(start<end) {
			sum = nums[start]+nums[end];
			
			temp = Math.abs(sum);
			
			if(temp<gap) {
				gap=temp;
				ans1=nums[start];
				ans2=nums[end];
			}
			
			if(sum>0) end--;
			else start++;
		}
		
		System.out.println(ans1 + " "+ ans2);
		
	}

}
