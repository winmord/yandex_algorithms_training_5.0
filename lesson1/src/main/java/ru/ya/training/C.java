package ru.ya.training;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long count = 0;

        for (int i = 0; i < n; i++) {
            long tmp = scanner.nextLong();
            count += tmp / 4L;
            count += Math.min(tmp % 4L, 2L);
        }

        System.out.println(count);
    }
}
