package java_test;

import java.io.*;

public class b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        if (check(s)) {
            bw.write("O");
        } else {
            bw.write("X");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean check(String s) {
        return switch (s) {
            case "a", "e", "i", "o", "u" -> true;
            default -> false;
        };
    }

}