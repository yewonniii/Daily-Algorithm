package 2023.02FEB.d0225;

public class 프로그래머스_Lv1_최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int mw=0, mh=0;
        
      for(int i=0; i<sizes.length; i++){
          int w = Math.max(sizes[i][0],sizes[i][1]); //큰건 가로로
          int h = Math.min(sizes[i][0],sizes[i][1]); //작은건 세로로

          mw = Math.max(w,mw);
          mh = Math.max(h,mh);

          answer = mw*mh;
        }
        
        return answer;
    }
    
}
