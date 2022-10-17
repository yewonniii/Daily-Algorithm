package d1017;

import java.util.*;

public class 프로그래머스_Lv2_가장큰수 {
	public String solution(int[] numbers) {
		String answer = "";
		String [] str = new String[numbers.length];
		
		for(int i=0; i<numbers.length; i++){
			str[i] = Integer.toString(numbers[i]);
		}
		
		Arrays.sort(str,new Comparator<String>(){
			@Override
			public int compare(String a, String b){
				return (b+a).compareTo(a+b);
	            }
		});

		if(str[0] =="0"){
			return "0";
		}else{
			for(int i=0; i<str.length; i++){
				answer += str[i];
			}  
		}
	        
		return answer;
	}

}
