// 문자열의 뒤의 n글자
public class Solution_38 {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length()-n, my_string.length());
        return answer;
    }
}
