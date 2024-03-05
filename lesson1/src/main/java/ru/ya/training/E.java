package ru.ya.training;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int d = scanner.nextInt();

        StringBuilder tmp = new StringBuilder(calculate(n, k));

        if (!"-1".contentEquals(tmp)) {
            tmp.append("0".repeat(Math.max(0, d - (tmp.length() - String.valueOf(n).length()))));
        }

        System.out.println(tmp);
    }

    static String calculate(int n, int k) {
        for (int j = 0; j < 10; j++) {
            int value = n * 10 + j;
            if (value % k == 0) {
                return String.valueOf(value);
            }
        }

        return "-1";
    }
}