package 2023.03MAR.d0321;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2501_약수구하기 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int k=1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				list.add(i);
			}
		}
		
		int[] ans = new int[list.size()];
		
		for(int i=0; i<ans.length; i++) {
			ans[i]=list.get(i);
		}
		
		if(list.size() < K) {
			System.out.println(0);
		}else {
			System.out.println(ans[K-1]);
		}
		
	}

}