public class Solution_42 {
    public int[] solution(int[] arr) {
        // 내 풀이
        int[] answer = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2 == 0) {
                if (arr[i] >= 50) {
                    answer[i] = arr[i]/2;
                } else {
                    answer[i] = arr[i];
                }
            } else {
                if (arr[i] < 50) {
                    answer[i] = arr[i]*2;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;

        /*
        // 다른 사람의 풀이
        for(int i=0; i<arr.length; i++){
            if (arr[i]>=50 && arr[i]%2==0) {
                arr[i] = arr[i]/2;
            }else if (arr[i]<50 && arr[i]%2==1) {
                arr[i] = arr[i]*2;
            }
        }
        return arr;
        */
    }
}
