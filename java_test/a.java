package java_test;

import java.io.*;

public class a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        br.close();

        sb.append(num);
        bw.write(sb.reverse().toString());
        bw.flush();
        bw.close();    }

}