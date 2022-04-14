package d0414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_BOJ_14425_문자열집합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String,Integer> hmap = new HashMap<String, Integer>();
		
		int cnt =0;
		
		for (int i = 0; i < N; i++) {
			hmap.put(br.readLine(), 1);
		}
		
		for (int i = 0; i < M; i++) {
			if(hmap.get(br.readLine()) != null ) cnt++;
		}

		System.out.println(cnt);
	}

}
