package step_04;
import java.util.*;

public class _07_5597 {
    public static void main(String[] args) {
        // 내 풀이
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int a;

        for (int i=0; i<30; i++) {
            arr.add(i, i+1);
        }

        for (int i=0; i<28; i++) {
            arr.remove(Integer.valueOf(sc.nextInt()));
        }

        for (int b : arr) {
            System.out.println(b);
        }

        /*
        // 다른 사람의 풀이
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[30]; // 크기가 30인 배열 생성

        for(int i=0; i<28; i++) { // 28번 입력을 위해서 for문 사용
            int num = scan.nextInt(); // 28번 입력 반복적으로
            for(int j=0; j<30; j++) { // 배열이 만약 순서대로 1~30까지 있다면 num을 입력하면 if문을 통해 그 자리와 맞을 경우 값을 1로 한다.
                if(num == j+1) arr[j]=1;
            }
        }

        for(int i=0; i<30; i++) { // 1이 없는 곳은 출석번호를 부르지 않는 곳이다.
            if(arr[i] != 1){
                System.out.println(i+1);
            }
        }
        */
    }
}
