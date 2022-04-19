package d0419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_BOJ_4949_균형잡힌세상 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> st = new Stack<Character>();

		while(true) {
			st.clear();
			String str = br.readLine();
			if(str.equals(".")) break;
			
			for (int i = 0; i < str.length(); i++) {
				char ch=str.charAt(i);
				
				if(ch=='(' || ch == '[') {
					st.push(ch);
				}
				else if (ch == ')' || ch == ']') {
					if (st.isEmpty() || (st.peek() == '(' && ch == ']') || (st.peek() == '[' && ch == ')')) {
						st.push(ch);
						break;
					}
					st.pop();

				}
			}
			
			if (!st.isEmpty()) System.out.println("no");
			else System.out.println("yes");
			
		}	

	}

}
