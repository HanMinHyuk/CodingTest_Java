public class Solution_29 {
    public String solution(String[] str_list, String ex) {
        // 내 풀이
        String answer = "";


        for (int i=0; i<str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                answer += str_list[i];
            } else {
                continue;
            }
        }

        return answer;

        /*
        // 다른 사람의 풀이
        StringBuilder sb = new StringBuilder(); // StringBuilder 사용

        for (String s : str_list) {
            sb.append(s.contains(ex) ? "" : s); // 삼항 연산자 사용
        }

        return sb.toString();
        */
    }
}
