import java.util.*;
import java.io.*;

public class practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
        String str = "abcdef"; // 출력할 문자열
        bw.write(s); // 출력
        bw.newLine(); // 줄바꿈
        bw.flush(); // 남아있는 데이터 모두 출력
        bw.close();
    }
}
