package d1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_3986_좋은단어 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
	
		int cnt=0;
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			
			stack.push(str.charAt(0));
			
			for (int j = 1; j < str.length(); j++) {
				char now = str.charAt(j);
				if(!stack.isEmpty()) {
					if(stack.peek() == now) {
						stack.pop();
						continue;
					}
				}
				stack.push(now);
				
			}
			
			if(stack.isEmpty()) cnt++;
		}
		System.out.println(cnt);

	}

}
