package step_02;
import java.util.*;
//오븐 시계
// A와 B를 합쳐서 분으로 만들어서 C와 더한 다음, 다시 시와 분으로 바꾸는 방법

public class _06_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 시
        int B = sc.nextInt(); // 분
        int C = sc.nextInt(); // 요리하는 데 필요한 시간
        sc.close();

        int min = 60 * A + B; // 시와 분을 하나의 분으로 변환
        min = min + C; // 필요한 시간과 합함.

        int hour = min / 60; // 60으로 나누어 시로 바꿈
        int minute = min % 60; // 60으로 나눈 나머지가 분임.

        if (23 < hour) { // 시가 24 이상이 되면 0부터 다시 시작해야 함.
            hour = hour - 24;
        }

        System.out.println(hour + " " + minute);
    }
}
