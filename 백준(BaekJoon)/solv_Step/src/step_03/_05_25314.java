package step_03;
import java.util.*;
// 코딩은 체육과목 입니다.

public class _05_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n = n / 4; // n은 4의 배수

        for (int i=1; i<=n; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
