import java.util.*;

public class 프로그래머스_Lv2_게임맵최단거리 {
    // 하좌상우
    int[] dr = { -1, 0, 1, 0 };
    int[] dc = { 0, 1, 0, -1 };

    boolean[][] isVisited;
    int n, m;

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;

        isVisited = new boolean[n][m];
        return bfs(0, 0, maps);
    }

    public int bfs(int c, int r, int[][] maps) {
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(c, r, 1));
        isVisited[c][r] = true;

        while (!que.isEmpty()) {
            Node node = que.poll();

            if (node.c == n - 1 && node.r == m - 1)
                return node.cost;

            for (int d = 0; d < 4; d++) {
                int nc = node.c + dc[d];
                int nr = node.r + dr[d];

                if (nc >= 0 && nc < n && nr >= 0 && nr < m) {
                    if (!isVisited[nc][nr] && maps[nc][nr] == 1) {
                        isVisited[nc][nr] = true;
                        que.add(new Node(nc, nr, node.cost + 1));
                    }
                }
            }
        }
        return -1;
    }

    public class Node {
        int c;
        int r;
        int cost;

        public Node(int c, int r, int cost) {
            this.c = c;
            this.r = r;
            this.cost = cost;
        }
    }
}
