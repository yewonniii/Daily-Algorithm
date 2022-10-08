package d1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1158_요세푸스문제 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while(queue.size() != 1) {
			for (int i = 0; i < K-1; i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()+",");
		}
		
		if(queue.size() ==1) {
			sb.append(queue.poll()+">");
		}
		
		System.out.println(sb.toString());
	}

}
