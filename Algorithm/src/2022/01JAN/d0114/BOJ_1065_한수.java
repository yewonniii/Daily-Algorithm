package d0114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1065_한수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int ans=0;
		
		if(N<100) {
			System.out.println(N);
		}else {
			ans=99;
			
			if(N==1000) {
				N=999;
			}
			
			for (int i = 100; i <=N; i++) {
				int hundred = i/100;
				int ten = (i/10)%10;
				int one = i%10;
				
				//각 자리가 수열을 이룬다면 
				if((hundred-ten)==(ten-one)) {
					ans++;
				}
			}
			System.out.println(ans);
		}
		
	}

}
