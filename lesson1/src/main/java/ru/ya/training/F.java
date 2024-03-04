package ru.ya.training;

import java.util.Scanner;

// 5
// 450402558 -840167367 -231820501 586187125 -627664645

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] nums = new long[n];

        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextLong();
            if (nums[i] % 2 != 0) {
                ++oddCount;
            }
        }

        boolean isFirst = true;
        if (oddCount % 2 != 0) {
            for (int i = 0; i < n - 1; i++) {
                System.out.print("+");
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (isFirst && i + 1 < n && (nums[i] % 2 != 0 && nums[i + 1] % 2 == 0 || nums[i] % 2 == 0 && nums[i + 1] % 2 != 0)) {
                    System.out.print("x");
                    isFirst = false;
                } else {
                    if (i != n - 1) {
                        System.out.print("+");
                    }
                }
            }
        }
    }
}
