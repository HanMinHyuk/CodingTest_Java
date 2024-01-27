package step_03;
import java.io.*;
import java.util.*;
// 문제에서 입력은 여러 개의 테스트 케이스로 이루어져 있다 ==> while문을 사용
// 만약 문제에서 테스트 케이스의 개수를 정해준다면

public class _11_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        int A, B, sum;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            sum = A + B;
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
