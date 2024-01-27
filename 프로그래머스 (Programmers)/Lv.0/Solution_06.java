import java.util.*;

public class Solution_06 {
    public String[] solution(String myStr) {
        // 나의 풀이
        String[] myStrArr = myStr.split("a|b|c");
        ArrayList<String> arr_new = new ArrayList<>();
        String k = "";

        for (int i=0; i<myStrArr.length; i++) {
            if (!myStrArr[i].equals("")) {
                arr_new.add(myStrArr[i]);
            }
        }

        if (myStrArr.length == 0) arr_new.add("EMPTY");

        return arr_new.toArray(new String[0]);

        /*
        // 다른 사람의 풀이
        String[] arr = Arrays.stream(myStr.split("[abc]+")).filter(str -> !str.isEmpty()).toArray(String[]::new);
        return arr.length == 0 ? new String[] { "EMPTY" } : arr;

        // [abc] -> 대괄호 안에 있는 문자 1개 인식,  a or b or c와 같음
        // + -> 앞 문자가 1개 이상 존재
        */
    }


}
