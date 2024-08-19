package java_test;

import java.io.*;

public class e {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        int month = Integer.parseInt(br.readLine());
        int day = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> checkLeapYear(year);
            default -> 31;
        };

        System.out.println(day);
    }

    private static int checkLeapYear(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            return 29;
        }
        return 28;
    }

}