package d1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class boj_10773_제로 {

	public static void main(String[] args) throws  IOException {
		Stack<Integer> stack = new Stack<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		for (int i = 0; i <K; i++) {
			int N = Integer.parseInt(br.readLine());

			if(N ==0) {
				stack.pop();
			} else{
				stack.push(N);
			}

		}
	
		int sum=0;
		
		while(!stack.isEmpty()) {
			
			sum += stack.pop();
		}

		System.out.println(sum);
		
	}

}
