package step_04;
import java.io.*;
import java.util.*;

public class _05_10810 {
    public static void main(String[] args) throws IOException {
        // 내가 한 것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NM, abc;
        NM = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());
        int[] basket = new int[N];

        for (int i=0; i<M; i++) {
            abc = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(abc.nextToken());
            int b = Integer.parseInt(abc.nextToken());
            int c = Integer.parseInt(abc.nextToken());
            for (int j=a; j<=b; j++) {
                basket[j-1] = c;
            }
        }

        for (int value : basket) {
            System.out.print(value + " ");
        }

        /*
        // 다른 사람이 한 것
        Scanner sc = new Scanner(System.in);
        int basketCount = sc.nextInt();
        int count = sc.nextInt();
        int[] baskets = new int[basketCount];
        for (int i=0; i<count; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ballNum = sc.nextInt();
            for (int j=start-1; j<end; j++) {
                baskets[j] = ballNum;
            }
        }
        for (int value : baskets)
            System.out.print(value + " ");
        */
    }
}
