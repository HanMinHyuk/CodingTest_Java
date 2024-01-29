import java.util.*;
// 무작위로 K개의 수 뽑기
public class Solution_08 {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        int[] arr_k = Arrays.stream(arr).distinct().toArray(); // distinct() -> 중복된 값을 제거
        ArrayList<Integer> arr_new = new ArrayList<Integer>(); // 정수형 list 생성

        // 길이 k 만큼 list에 넣고 배열 arr보다 길이가 길면 나머지를 -1로 채워 넣는다.
        for (int i = 0; i < k; i++) {
            if (arr_k.length <= i) {
                arr_new.add(-1);
                continue;
            }
            arr_new.add(arr_k[i]);

        }

        // list를 배열로 다시 변환
        answer = arr_new.stream().mapToInt(i -> i).toArray();
        return answer;

    }
}
