import java.util.*;
import java.util.stream.Stream;
// 배열의 원소만큼 추가하기
public class Solution_07 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        ArrayList<Integer> arr_new = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i]; j++) {
                arr_new.add(arr[i]);
            }
        }
        answer = arr_new.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
