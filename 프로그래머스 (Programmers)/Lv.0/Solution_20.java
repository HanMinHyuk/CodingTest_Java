// 글자 이어 붙여 문자열 만들기
public class Solution_20 {
    // 내 풀이
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int i=0; i<index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        return answer;

        /*
        // 다른 사람의 풀이
        StringBuilder sb = new StringBuilder(); // 많은 문자열을 연결하면 많은 중간 문자열 객체가 생성되어 비효율적인 코드가 생성됨.
                                                // StringBuilder는 Stringr과 다르게 변경 가능한 문자열을 만들어 줌.
        for (int idx : index_list)
            sb.append(my_string.charAt(idx));   // append 인자로 연결하고자 하는 문자열을 넣는다.

        return sb.toString();                   // StringBuilder 출력 시 toString() 붙여야 함.
        */
    }
}
