package d0513;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_BOJ_1436_영화감독숌 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = 0;
		
		while(N>0) {
			num ++;
			String str = Integer.toString(num);
			
			if(str.contains("666")) {
				N--;
			}
		}
		
		System.out.println(num);

	}

}
