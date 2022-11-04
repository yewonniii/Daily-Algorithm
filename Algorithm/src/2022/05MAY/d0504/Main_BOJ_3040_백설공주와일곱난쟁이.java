package d0504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BOJ_3040_백설공주와일곱난쟁이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] shorts = new int[9];
		int sum = 0;
		int fake1=0, fake2=0;
		
		for (int i = 0; i < 9; i++) {
			shorts[i]=Integer.parseInt(br.readLine());
			sum += shorts[i];
		}

		for (int i = 0; i < shorts.length-1; i++) {
			for (int j = i; j < shorts.length; j++) {
				if(sum-shorts[i]-shorts[j]==100 && i != j) {
					fake1=i;
					fake2=j;
					break;
				}
			}
		}
		
		for (int i = 0; i < shorts.length; i++) {
			if(i== fake1 || i== fake2)
				continue;
			System.out.println(shorts[i]);
		}
	}

}
