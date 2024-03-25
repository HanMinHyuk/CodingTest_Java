package _0x06_Queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _01_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int s2 = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push":
                    s2 = Integer.parseInt(st.nextToken());
                    queue.add(s2);
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        bw.write(queue.poll() + "\n");
                        break;
                    } else {
                        bw.write(-1 + "\n");
                        break;
                    }
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        bw.write(1 + "\n");
                        break;
                    } else {
                        bw.write(0 + "\n");
                        break;
                    }
                case "front":
                    if (!queue.isEmpty()) {
                        bw.write(queue.peek() + "\n");
                        break;
                    } else {
                        bw.write(-1 + "\n");
                        break;
                    }
                case "back":
                    if (!queue.isEmpty()) {
                        bw.write(s2 + "\n");
                        break;
                    } else {
                        bw.write(-1 + "\n");
                        break;
                    }
            }
        }
        bw.flush();
        bw.close();
    }
}
