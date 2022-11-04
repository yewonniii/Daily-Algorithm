package d1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class boj_2164_카드2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		for (int i = 1; i <=N; i++) {
			que.add(i);
		}
		
		while(que.size() != 1) {
			que.poll();
			que.add(que.poll());		
		}
		
		if(que.size() == 1) {
			System.out.println(que.poll());
		}
	}

}
