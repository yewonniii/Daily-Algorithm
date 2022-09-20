package d0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1769_3의배수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X = br.readLine();
		
		int cnt = 0;
		
		while(true) {
			long sum =0;
			if(X.length()==1) break;
			
			for (int i = 0; i < X.length(); i++) {
				sum += Integer.parseInt(String.valueOf(X.charAt(i)));
			}
			
			cnt++;
			X = String.valueOf(sum);
		}
		
		if(Integer.parseInt(String.valueOf(X)) % 3 ==0) {
			System.out.println(cnt);
			System.out.println("YES");
		}else {
			System.out.println(cnt);
			System.out.println("NO");
		}
	}

}
