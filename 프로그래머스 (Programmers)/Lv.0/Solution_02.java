import java.util.*;

public class Solution_02 {
    public String[] solution(String[] strArr) {
        // 내 풀이
        List<String> answer = new ArrayList<>(); // List 생성 -> 배열은 사이즈가 고정이지만 list는 유동적임.

        for (String str : strArr) {
            if (!str.contains("ad")){
                answer.add(str);
            }
        }

        return answer.toArray(new String[0]); // list를 배열로 변환해줌 / 0이란 배열의 사이즈가 0이 되고 list의 사이즈와 비교하여 더 큰 것이 배열의 사이즈가 된다.

    }

}
