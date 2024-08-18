package java_test;

import java.io.*;

public class d {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int sum = 0;

        while (true) {
            num = Integer.parseInt(br.readLine());
            if (num <= 0) {
                System.out.println("X");
            } else {
                for (int i = 1; i <= num; i++) {
                    sum += i;
                }
                break;
            }
        }
        System.out.println(sum);
    }
}