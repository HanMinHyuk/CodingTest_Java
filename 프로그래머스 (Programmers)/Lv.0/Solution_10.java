import java.util.*;
// 홀짝 구분하기
public class Solution_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 내 풀이
        if (n%2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n  + " is odd");
        }

        /*
        // 다른 사람의 풀이
        System.out.print(n + " is " + (n%2 == 0 ? "even" : "odd"));
        */
    }
}
