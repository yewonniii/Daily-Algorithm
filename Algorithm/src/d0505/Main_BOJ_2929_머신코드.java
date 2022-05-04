package d0505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BOJ_2929_머신코드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		String regex = "^[A-F]?A+F+C+[A-F]?$";
		
		for (int i = 0; i < T; i++) {
			if(br.readLine().matches(regex)) {
				System.out.println("Infected!");
			}else {
				System.out.println("Good");
			}
			
		}
	}

}
