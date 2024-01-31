import java.util.*;
// 5명씩
public class Solution_25 {
    public ArrayList<String> solution(String[] names) {
        // 내 풀이
        ArrayList<String> answer = new ArrayList<String>(); // String 리스트 선언

        int count = 0;

        for (int i=0; i<names.length; i += 5) {
            answer.add(names[i]); // list에 add()를 써서 추가
            count++;
        }
        return answer;

        /*
        // 다른 사람의 풀이
        int idx = 0;
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1]; // 나머지가 0이면 names.length에 5를 나눈 값
        for (int i = 0;i < names.length;i+=5)                                                          // 0이 아니면 names.length에 5를 나누고 +1을 한 값
            answer[idx++] = names[i];
        return answer;
        */
    }
}
