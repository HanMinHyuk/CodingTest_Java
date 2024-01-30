import java.util.*;
// 접미사 배열
public class Solution_21 {
    public String[] solution(String my_string) {
        // 내 풀이
        // 결과를 도출하기 위한 배열 생성
        String[] k = new String[my_string.length()];

        // 문자열을 계속해서 변경해야 하기 때문에 StringBuilder 사용
        StringBuilder sb = new StringBuilder(my_string);

        // 반복문을 사용하여 k 배열에 StringBuilder를 넣는다.
        for (int i=0; i<k.length; i++) {
            k[i] = sb.toString();
            sb.deleteCharAt(0); // 인덱스에 위치한 문자 하나를 삭제한다.
        }
        Arrays.sort(k); // 문자열 배열을 오름차순으로 정렬
        return k;

        /*
        // 다른 사람의 풀이
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i, my_string.length()); // substring(i, k) -> my_string에서 인덱스 i부터 k-1까지 보여준다.
        }

        Arrays.sort(answer);
        return answer;
        */
    }
}
