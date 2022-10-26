package d1027;

public class 프로그래머스_Lv1_문자열다루기기본 {
    public boolean solution(String s) {
        if(s.length()!=4 && s.length() !=6) return false;
        
        char [] ch = s.toCharArray();
        
        for(int i=0; i<ch.length; i++){
            if( ! isNumber(ch[i])) return false;
        }
        return true;
    }
    
    public boolean isNumber(char c){
        final int A =c;
        return 48<=A && A<=57;
    }
}
