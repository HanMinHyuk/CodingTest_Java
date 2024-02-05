package step_04;
import java.io.*;
import java.util.*;

public class _08_10811 {
    public static void main(String[] args) throws IOException {
        // 내 풀이
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = i+1;
        }

        for (int i=0; i<M; i++) {
            int left = sc.nextInt()-1; // 배열 0부터 시작
            int right = sc.nextInt()-1;

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        sc.close();

        for (int baguni : arr) {
            System.out.print(baguni + " ");
        }

        /*// 다른 사람과 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = i+1;
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int left = Integer.parseInt(st.nextToken()) - 1;
            int right = Integer.parseInt(st.nextToken()) - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        br.close();

        for (int baguni : arr) {
            System.out.print(baguni + " ");
        }*/
    }
}
