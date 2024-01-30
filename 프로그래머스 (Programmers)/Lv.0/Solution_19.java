// 카운트 업
public class Solution_19 {
    public int[] solution(int start_num, int end_num) {
        // 내 풀이
        int[] answer = new int[end_num - start_num + 1];
        for (int i=start_num; i<=end_num; i++) {
            answer[i-start_num] = i;
        }
        return answer;

        /*
        // 다른 사람의 풀이
        int[] answer = new int[end - start+1];
        for(int i =0; i<= end - start; i++) {
            answer[i] = start + i;
        }
        return answer;
        */
    }
}
