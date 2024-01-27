package step_04;
import java.util.*;
import java.io.*;

public class _01_10807 {
    public static void main(String[] args) throws IOException {
        // 내가 한 것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());;
        int[] array = new int[N];
        int sum = 0;

        int v = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            array[i] = Integer.parseInt(st.nextToken());

            if (v == array[i]) {
                sum += 1;
            }

        }
        System.out.println(sum);
        br.close();

        /*
        // 다른 분이 한 것
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int[] totalNum = new int[N];

        for (int i=0; i<N; i++) {
            int num = sc.nextInt();
            totalNum[i] = num;
        }

        int v = sc.nextInt();
        for (int i=0; i<N; i++) {
            if (v == totalNum[i]) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
        */


    }
}
