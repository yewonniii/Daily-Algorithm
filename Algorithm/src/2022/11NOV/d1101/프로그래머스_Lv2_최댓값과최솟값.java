package d1101;

import java.util.*;

public class 프로그래머스_Lv2_최댓값과최솟값 {
	
    public String solution(String s) {
        String [] str = s.split(" ");       
        int [] nums = new int [str.length];
        
        for(int i=0; i<str.length; i++){
             nums[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(nums);
        
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append(" ").append(nums[nums.length-1]);
       
        return sb.toString();
    }

}
