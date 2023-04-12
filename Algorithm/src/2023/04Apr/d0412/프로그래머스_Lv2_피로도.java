import java.util.*;

public class 프로그래머스_Lv2_피로도 {
    static boolean[] isVisited;
    static int answer;

    public int solution(int k, int[][] dungeons) {
        answer = -1;
        isVisited = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }

    public void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!isVisited[i] && dungeons[i][0] <= k) {
                isVisited[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                isVisited[i] = false;
            }
        }

        answer = Math.max(answer, depth);
    }

}
