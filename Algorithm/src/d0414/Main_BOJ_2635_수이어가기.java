package d0414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_BOJ_2635_수이어가기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		ArrayList<Integer> res = new ArrayList<>();
		
		for (int i = N; i >= N/2; i--) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(N);
			
			int tmp = N;
			int tmp2 = i;
			
			while(true) {
				if(tmp<0) break;
				
				int tmp3 =tmp;
				
				if(tmp2>=0) list.add(tmp2);
				
				tmp = tmp2;
				tmp2 = tmp3 - tmp;
			}
			
			if(cnt<list.size()) {
				cnt = list.size();
				res = list;
			}
		}
		System.out.println(cnt);
		for (Integer num : res) {
			System.out.print(num+" ");
		}

	}

}
