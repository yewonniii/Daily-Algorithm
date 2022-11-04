package d0421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BOJ_10809_알파벳찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int [] alphabet = new int [26];
		
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] =-1;
		}
	
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			
			if(alphabet[c-'a']==-1) {
				alphabet[c-'a'] = i;
			}
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
	}

}
