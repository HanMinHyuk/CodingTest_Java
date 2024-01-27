package step_03;
import java.io.*;
import java.util.StringTokenizer;
// BufferedReader와 StringTokenizer와 BufferedWriter을 사용하여 입출력

public class _06_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        bw.close();


        /*
        st = new StringTokenizer(br.readLine()); // 띄어쓰기 기준으로 문자열을 분리, 만약 1 3 이렇게 쓰면
        // st = new StringTokenizer(문자열, 구분자); // 구분자를 기준으로 문자열을 분리
        bw.write(Integer.parseInt(st.nextToken()) + "\n"); // 띄어쓰기 단위로 1 출력
        bw.write(Integer.parseInt(st.nextToken()) + "\n"); // 띄어쓰기 단위로 3 출력
        bw.close();
        */

    }
}
