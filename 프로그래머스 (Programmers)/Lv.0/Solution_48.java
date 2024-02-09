// 홀짝에 따라 다른 값 반환하기
public class Solution_43 {
    public int solution(int n) {
        int[] arr = new int[n];
        int answer = 0;

        for (int i=0; i<n; i++) {
            arr[i] = i+1;

            if (n%2 == 0 && arr[i]%2 == 0) {
                answer += (arr[i]*arr[i]);
            } else if (n%2 == 1 && arr[i]%2 == 1) {
                answer += arr[i];
            } else {
                continue;
            }
        }

        return answer;

        /*
        // 다른 사람의 풀이
        int answer = 0;

        for(int i = n; i >= 0; i -= 2)
            answer += (n % 2 == 0) ? i * i : i;

        return answer;
        */
    }
}
