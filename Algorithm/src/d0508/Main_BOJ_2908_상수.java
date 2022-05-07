package d0508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_2908_상수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(A>B? A : B);
	}

}
