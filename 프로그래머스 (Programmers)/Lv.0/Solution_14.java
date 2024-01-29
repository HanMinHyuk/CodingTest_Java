// 등차수열의 특정한 항만 더하기
public class Solution_14 {
    public int solution(int a, int d, boolean[] included) {
        // 내 풀이
        int answer = 0;
        int sum = a;

        int[] arr = new int[included.length];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sum;
            answer += included[i] ? sum : 0;
            sum += d;
        }
        return answer;

        /*
        // 다른 사람의 풀이
        int answer = 0;
        for (int i=0; i<included.length; i++) {
            if (included[i]) {
                answer += a + (d*i); // 등차수열!!
            }
        }
        return answer;
        */
    }
}
