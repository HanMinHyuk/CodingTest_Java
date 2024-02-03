// n번째 원소까지

public class Solution_39 {
    public int[] solution(int[] num_list, int n) {
        // 내 풀이
        int[] answer = new int[n];
        for (int i=0; i<n; i++) {
            answer[i] = num_list[i];
        }
        return answer;

        /*
        // 다른 사람의 풀이
        int[] answer = {};

        answer = Arrays.copyOfRange(num_list,0,n); // Arrays.copyOfRange(원본 배열, 복사할 시작 인덱스, 복사할 끝 인덱스) -> 복사할 끝 인덱스 전까지 복사

        return answer;
        */
    }
}
