// A 강조하기
public class Solution_27 {
    // 내 풀이
    public String solution(String myString) {
        String answer = "";
        char tmp;

        for (int i=0; i<myString.length(); i++) {
            tmp = myString.charAt(i);
            if (tmp == 'a') { // 소문자 'a'일 경우
                answer += myString.valueOf(tmp).toUpperCase();
            } else if (tmp == 'A') {
                answer += (char)tmp;
            } else if ((65<=tmp) && (tmp<=90)) { // 대문자일 경우
                answer += myString.valueOf(tmp).toLowerCase();
            } else { // 소문자 'a'가 아닌 다른 소문자일 경우
                answer += (char)tmp;
            }
        }
        return answer;

        /*
        // 다른 사람의 풀이
        myString = myString.toLowerCase();
        mytString = myString.replace('a', 'A'); // 교체하기 -> 'a'를 'A'로 변환

        return myString;
        */
    }
}
