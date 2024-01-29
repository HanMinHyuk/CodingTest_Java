// 마지막 두 원소
public class Solution_16 {
    // 내 풀이
    public int[] solution(int[] num_list) {
        int k = num_list.length;
        int[] answer = new int[k+1];
        int num = num_list[k-1] > num_list[k-2] ? num_list[k-1] - num_list[k-2] : num_list[k-1]*2;

        for (int i=0; i<k; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length-1] = num;
        return answer;
    }

    // 다른 사람의 풀이
    // 비슷함
}
