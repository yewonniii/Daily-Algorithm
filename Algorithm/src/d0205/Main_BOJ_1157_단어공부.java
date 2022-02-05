package d0205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BOJ_1157_단어공부 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] eng = new int[26];
		
		String str = br.readLine().toUpperCase();
		
		int max=-1;
		char c = '?';
		
		for (int i = 0; i < str.length(); i++) {
			eng[str.charAt(i)-65]++;
			if(max<eng[str.charAt(i)-65]) {
				max=eng[str.charAt(i)-65];
				c=str.charAt(i);
			}
			else if(max==eng[str.charAt(i)-65]) c='?';
		}
		
		System.out.println(c);

	}

}
