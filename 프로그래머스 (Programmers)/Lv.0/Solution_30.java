// 날짜 비교하기
public class Solution_30 {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;

        if (date2[0] > date1[0]) {
            answer = 1;
        } else if ((date1[0]==date2[0]) && (date2[1]>date1[1])) {
            answer = 1;
        } else if ((date1[0]==date2[0]) && (date1[1]==date2[1]) && (date2[2]>date1[2])) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;

        /*
        // 다른 사람의 풀이
        int answer = 0;

        for (int i=0; i<date1.length; i++) {
            if (date1[i] < date2[i]) {
                answer = 1;
                break;
            } else if (date1[i] > date2[i]) {
                answer = 0;
                break;
            }
        }

        return answer;
        */
    }

}
