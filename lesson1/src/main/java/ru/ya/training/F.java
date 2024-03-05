package ru.ya.training;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] nums = new long[n];

        int oddCount = 0;
        long prev = 0;
        int idx = -1;

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextLong();
            if (nums[i] % 2 != 0) {
                ++oddCount;
                if (i != 0 && idx < 0 && prev % 2 == 0) {
                    idx = i;
                }
            } else {
                if (i != 0 && idx < 0 && prev % 2 != 0) {
                    idx = i;
                }
            }
            prev = nums[i];
        }

        if (oddCount % 2 != 0) {
            System.out.print("+".repeat(n - 1));
        } else {
            if (idx > 0) {
                System.out.print("+".repeat(idx - 1) + "x" + "+".repeat(n - 1 - 1 - (idx - 1)));
            } else {
                System.out.print("x" + "+".repeat(n - 2));
            }
        }
    }
}
