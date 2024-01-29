import java.util.*;
// 뒤에서 5등까지
public class Solution_09 {
    public int[] solution(int[] num_list) {
        // 내 풀이
        int[] answer = {};
        ArrayList<Integer> num_list_new = new ArrayList<>();

        // num_list 배열을 num_list_new 리스트에 넣기
        for (int i=0; i<num_list.length; i++) {
            num_list_new.add(num_list[i]);
        }

        // 오름차순 정렬
        Collections.sort(num_list_new);

        // 가장 작은 5개의 수로 변환
        if (num_list.length > 5) {
            for (int j=num_list.length-1; j>4; j--) {
                num_list_new.remove(j);
            }
        }

        // 리스트에서 배열로 변환
        answer = num_list_new.stream().mapToInt(i -> i).toArray();

        return answer;

        /*
        // 다른 사람의 풀이
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for (int i=0; i<answer.length; i++) {
            answer[i] = num_list[i];
        }
        return answer;
        */
    }
}
