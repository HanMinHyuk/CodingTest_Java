// flag에 따라 다른 값 반환하기
// flag : 상태를 기록하고 처리 흐름을 제어하기 위한 boolean 변수
public class Solution_13 {
    public int solution(int a, int b, boolean flag) {
        int answer = flag ? a+b : a-b; // 삼항 연산자 (조건식) ? A : B  --> 참이면 A 수행, 거짓이면 B 수행

        return answer;
    }
}
