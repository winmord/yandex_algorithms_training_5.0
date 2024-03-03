package ru.ya.training;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(":");
        String[] secondLine = scanner.nextLine().split(":");
        int home = scanner.nextInt();

        int g1 = Integer.parseInt(firstLine[0]);
        int g2 = Integer.parseInt(firstLine[1]);
        int gc1 = Integer.parseInt(secondLine[0]);
        int gc2 = Integer.parseInt(secondLine[1]);

        int total1 = g1 + gc1;
        int total2 = g2 + gc2;

        int result = total2 - total1;
        gc1 += result;

        if (home == 1) {
            if (gc1 <= g2) {
                ++result;
            }
        } else {
            if (g1 <= gc2) {
                ++result;
            }
        }

        System.out.println(Math.max(result, 0));
    }
}
