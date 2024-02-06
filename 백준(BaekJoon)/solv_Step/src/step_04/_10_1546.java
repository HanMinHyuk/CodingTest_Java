package step_04;
// 평균
import java.util.*;

public class _10_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] score = new double[N];
        double[] operation = new double[N];
        double max = 0;
        double sum = 0;


        for (int i=0; i<N; i++) {
            score[i] = sc.nextDouble();
            if (max <= score[i]) {
                max = score[i];
            }
        }

        for (int i=0; i<N; i++) {
            operation[i] = (score[i]/max) * 100;
            sum += operation[i];
        }

        System.out.println(sum/N);
        sc.close();
    }
}
