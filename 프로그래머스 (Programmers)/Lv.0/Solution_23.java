import java.util.*;
// n번째 원소부터
public class Solution_23 {
    public int[] solution(int[] num_list, int n) {
        // 내 풀이
        int[] answer = new int[num_list.length - n + 1];

        int count =0;

        for (int i=n-1; i<num_list.length; i++) {
            answer[count] = num_list[i];
            count++;
        }

        return answer;

        /*
        // 다른 사람의 풀이
        int[] a = Arrays.copyOfRange(num_list, n-1, num_list.length);

        // Arrays.copyOf(원본배열, 복사할 길이); -> 길이만큼 복사
        // Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝 인덱스) -> 시작인덱스 부터 끝인덱스-1 까지 복사
        */
    }
}
