public class 프로그래머스_Lv2_카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;

        for (int i = 3; i <= sum; i++) {
            int j = sum / i;

            if (sum % i == 0 && j >= 3) {
                int w = Math.max(i, j);
                int h = Math.min(i, j);

                if ((w - 2) * (h - 2) == yellow) {
                    answer[0] = w;
                    answer[1] = h;
                }
            }
        }
        return answer;
    }
}
