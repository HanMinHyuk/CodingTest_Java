// 더 크게 합치기
public class Solution_43 {
    public int solution(int a, int b) {
        // 내 풀이
        String i = (a+"") + (b+"");
        String j = (b+"") + (a+"");


        int answer = Integer.parseInt(i) > Integer.parseInt(j) ? Integer.parseInt(i) : Integer.parseInt(j);

        return answer;
    }
}
