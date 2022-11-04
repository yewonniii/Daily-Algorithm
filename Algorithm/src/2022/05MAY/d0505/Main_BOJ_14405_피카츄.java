package d0505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BOJ_14405_피카츄 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		String regex = "(pi|ka|chu)*";
		
		if(str.matches(regex)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
