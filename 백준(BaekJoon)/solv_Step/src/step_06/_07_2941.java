package step_06;

import java.io.*;

public class _07_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int idx = 0;
        int cnt = 0;
        while (idx < str.length()) {
            char c = str.charAt(idx);

            if (idx == str.length() - 1) {
                cnt++;
                break;
            }

            if (c == 'c') {
                if (str.charAt(idx + 1) == '=' || str.charAt(idx + 1) == '-') {
                    idx += 2;
                    cnt++;
                } else {
                    idx++;
                    cnt++;
                }
            } else if (c == 'd') {
                if (str.charAt(idx + 1) == 'z') {
                    if (idx + 1 == str.length() - 1) {
                        idx++;
                        cnt++;
                    } else if (str.charAt(idx + 2) == '=') {
                        idx += 3;
                        cnt++;
                    }
                } else if (str.charAt(idx + 1) == '-') {
                    idx += 2;
                    cnt++;
                }
            }  else if (c == 'l' && str.charAt(idx + 1) == 'j') {
                idx += 2;
                cnt++;
            } else if (c == 'n' && str.charAt(idx + 1) == 'j') {
                idx += 2;
                cnt++;
            } else if (c == 's' && str.charAt(idx + 1) == '=') {
                idx += 2;
                cnt++;
            } else if (c == 'z' && str.charAt(idx + 1) == '=') {
                idx += 2;
                cnt++;
            } else {
                idx++;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
