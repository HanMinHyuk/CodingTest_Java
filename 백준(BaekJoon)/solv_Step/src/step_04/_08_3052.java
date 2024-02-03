package step_04;
import java.util.*;
// 나머지
public class _08_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        ArrayList<Integer> temp = new ArrayList<>();


        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt() % 42;
        }

        for (int i=0; i<arr.length; i++) {
            boolean flag = true;

            for(int j=0; j<i; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;
                }
            }

            if (flag) {
                temp.add(arr[i]);
            }
        }

        System.out.println(temp.size());

        /*
        // 다른 사람의 풀이
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt() % 42);
        }

        System.out.print(h.size());

        // Set 인터페이스
        // 객체를 중복해서 저장할 수 없으며, 하나의 null값만 저장할 수 있다.
        // 중복을 자동으로 제거 해준다.
        // Set은 비선형 구조이기 때문에 '순서'의 개념과 '인덱스'가 존재하지 않는다.
        // 때문에 값을 추가 / 삭제 하는 경우 Set 내부의 해당 값을 검색하여 해당 기능을 수행해야 한다.
        // 처리 속도가 List구조보다 느리다.

        // HashSet 클래스
        // set 인터페이스에서 지원하는 구현 클래스이다.
        // set의 성질을 그대로 상속받는 다는 것이 특징이다.
        */

    }
}
