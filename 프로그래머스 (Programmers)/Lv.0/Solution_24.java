// 홀수 vs 짝수
public class Solution_24 {
    public int solution(int[] num_list) {
        // 내 풀이
        int answer = 0;

        int sum_even = 0;
        int sum_odd = 0;

        for (int i=0; i<num_list.length; i++) {
            if (i%2==0) { // 인덱스는 0부터 시작하기 때문에 말로 하자면 '만약 홀수라면' 이렇게 된다.
                sum_odd += num_list[i];
            } else {
                sum_even += num_list[i];
            }
        }

        answer = (sum_even >= sum_odd) ? sum_even : sum_odd;

        return answer;
    }
}
