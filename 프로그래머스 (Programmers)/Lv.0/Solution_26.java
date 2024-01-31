// n보다 커질 때까지 더하기
public class Solution_26 {
    public int solution(int[] numbers, int n) {
        // 내 풀이
        int answer = 0;
        for (int i=0; i<numbers.length; i++) {
            answer += (answer <= n) ? numbers[i] : 0;
        }
        return answer;

        /*
        // 다른 사람의 풀이
        int answer = 0;

        for(int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }

        return answer;
        */
    }
}
