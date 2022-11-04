package d1025;

public class 프로그래머스_Lv1_숫자문자열과영단어 {
    static String [] nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        for(int i=0; i<10; i++){
            s = s.replace(nums[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);

        return answer;
    }
}
