package d1026;

public class 프로그래머스_Lv1_1차비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        for(int i=0; i<n; i++){
            String bin1 = Integer.toBinaryString(arr1[i]);
            String bin2 = Integer.toBinaryString(arr2[i]);
            
            bin1 = "0".repeat(n - bin1.length()) + bin1;
            bin2 = "0".repeat(n - bin2.length()) + bin2;
            
            String[] map1 = bin1.split("");
            String[] map2 = bin2.split("");
            
            StringBuilder sb = new StringBuilder();
            
            for(int j=0; j<n; j++){
                if(map1[j].equals("1") || map2[j].equals("1")){
                    sb.append("#");
                }else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}
