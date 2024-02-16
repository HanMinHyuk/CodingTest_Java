package step_05;
import java.util.*;
import java.io.*;
public class _10_5622 {
    public static void main(String[] args) {
        // 나의 풀이
        Scanner sc = new Scanner(System.in);

        String[] alphabet = sc.next().split("");
        int a = 0;
        int result = 0;

        for (int i = 0; i < alphabet.length; i++) {
            switch (alphabet[i]) {
                case "A": case "B": case "C":
                    a = 3;
                    result += a;
                    break;
                case "D": case "E": case "F":
                    a = 4;
                    result += a;
                    break;
                case "G": case "H": case "I":
                    a = 5;
                    result += a;
                    break;
                case "J": case "K": case "L":
                    a = 6;
                    result += a;
                    break;
                case "M": case "N": case "O":
                    a = 7;
                    result += a;
                    break;
                case "P": case "Q": case "R": case "S":
                    a = 8;
                    result += a;
                    break;
                case "T": case "U": case "V":
                    a = 9;
                    result += a;
                    break;
                case "W": case "X": case "Y": case "Z":
                    a = 10;
                    result += a;
                    break;
            }
        }
        System.out.println(result);

        /*
        // 다른 사람의 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 예를 들어 WA라고 입력했을 때
        String[] dial = {"", "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"}; // index가 시간이라고 생각하면 됩니다.
        int time = 0;
        for (int i=0; i<str.length(); i++) { // WA의 길이는 2 -> i=0 일때와 i=1일 때 두번 반복
            String target = str.charAt(i)+""; // i=0 일때 : W를 ""를 통해서 string 객체로 만들어서 target 변수에 저장
            for (int j=0; j<dial.length; j++) { // dial의 길이만큼 반복 수행
                if (dial[j].contains(target)) { // dial에서 이 W를 포함하고 있다면
                    time += j; // j를 time에다가 더하겠다 (j는 결국 초다. 다이얼이 1이면 2초, 다이얼이 2이면 3초...)
                }
            }
        }
        System.out.println(time);
        */
    }
}
