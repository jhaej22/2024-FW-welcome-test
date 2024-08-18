package java_test;

import java.io.*;

public class c {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int age = Integer.parseInt(br.readLine());
        int height = Integer.parseInt(br.readLine());

        if (age >= 14 || height >= 160) {
            bw.write("X");
        } else {
            bw.write("O");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}