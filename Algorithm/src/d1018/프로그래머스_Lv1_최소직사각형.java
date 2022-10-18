package d1018;

import java.util.*;

public class 프로그래머스_Lv1_최소직사각형 {

    public int solution(int[][] sizes) {
        int answer = 0;
        
        int mw =0;
        int mh =0;
        
        for(int i=0; i<sizes.length; i++){
            int w = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            
            mw = Math.max(w,mw);
            mh = Math.max(h,mh);
            
            answer = mw*mh;
        }
        
        return answer;
    }
}
