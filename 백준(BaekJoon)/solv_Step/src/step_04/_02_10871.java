package step_04;
import java.io.*;
import java.util.*;

public class _02_10871 {
    public static void main(String[] args) throws IOException {
        //내가 한 것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1, st2;

        st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());

        int[] A = new int[N];
        st2 = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st2.nextToken());

            if (A[i] < X) {
                sb.append(A[i]).append(" ");
            }
        }
        System.out.println(sb.toString());


        /*
        // 다른 사람이 한 것
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[]array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (array[i] < X) {
                System.out.print(array[i] + " ");
            }
        }
        */
    }
}
