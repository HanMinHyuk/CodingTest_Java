// 두 수의 연산값 비교하기
public class Solution_42 {
    public int solution(int a, int b) {
        int answer = ((Integer.parseInt(a+""+b)) > (2*a*b)) ? Integer.parseInt(a+""+b) : 2*a*b;

        return answer;
    }
}
