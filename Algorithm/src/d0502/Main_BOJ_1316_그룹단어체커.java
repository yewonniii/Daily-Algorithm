package d0502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BOJ_1316_그룹단어체커 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt =0;
		
		for (int i = 0; i <N; i++) {
			String str = br.readLine();
			
			boolean [] check = new boolean[26];
			boolean temp = true;
			
			for (int j = 0; j < str.length(); j++) {
				int idx = str.charAt(j)-'a';
				
				if(check[idx]) { //전에 사용한 적이 있고 
					if(str.charAt(j) != str.charAt(j-1)) { //전 문자와 연속되지 않는다면 
						temp=false; //그룹 단어 x 
						break;
					}
				}else { //전에 사용한 적 없으면 
					check[idx]=true; //그룹 단어 o
				}
			}
			if(temp) cnt++;
		}
		System.out.println(cnt);
	}

}
