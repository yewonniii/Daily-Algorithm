package d0205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main_BOJ_1475_방번호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		int [] nums = new int[10];
		
		for (char c : N.toCharArray()) {
			int num = c-'0';
			if(num == 9) {
				num=6;
			}
			nums[num]++;
		}
		nums[6]=nums[6]/2 + nums[6]%2;
		Arrays.sort(nums);
		
		System.out.println(nums[9]);

	}

}
