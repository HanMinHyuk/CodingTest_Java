// 주사위 게임 2
public class Solution_15 {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a==b && a==c) {
            answer = (a+b+c) * (int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)) * (int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
        } else if (a==b || a==c || b==c) {
            answer = (a+b+c) * (int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)); // Math.pow(밑, 지수) --> 거듭제곱 구하는 함수
        } else {
            answer = a+b+c;
        }
        return answer;

        /*
        // 다른 사람의 풀이
        public int solution(int a, int b, int c) {
            return a == b && b == c ? (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c) : a == b || b == c || c == a ? (a + b + c) * (a * a + b * b + c * c) : a + b + c;
        }
        */
    }
}
