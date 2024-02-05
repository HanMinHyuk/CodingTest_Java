// 이어 붙인 수
public class Solution_44 {
    public int solution(int[] num_list) {
        // 내 풀이
        String even = "";
        String odd = "";
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i]%2 == 0) {
                even += num_list[i] + "";
            } else {
                odd += num_list[i] + "";
            }
        }
        int answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;

        /*
        // 다른 사람의 풀이
        int answer = 0;

        int even = 0;
        int odd = 0;

        for(int num : num_list) {
            if(num % 2 == 0) {
                even *= 10;
                even += num;
            } else {
                odd *= 10;
                odd += num;
            }
        }
        answer = even + odd;

        return answer;
        */
    }
}
