package step_03;
import java.io.*;
import java.util.StringTokenizer;
// BufferedReader와 StringTokenizer와 BufferedWriter을 사용하여 A+B 하기
public class _08_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int A, B, sum;

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            sum = A + B;

            bw.write("Case #" + (i+1) + ": " + A + " + " + B + " = " + sum + "\n");

        }

        bw.flush();
        bw.close();
    }
}
