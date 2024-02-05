// 조건에 맞게 수열 변환하기 3
public class Solution_45 {
    public int[] solution(int[] arr, int k) {
        for (int i=0; i<arr.length; i++) {
            if (k%2 == 1) {
                arr[i] = arr[i] * k;
            } else {
                arr[i] = arr[i] + k;
            }
        }
        return arr;
    }
}
