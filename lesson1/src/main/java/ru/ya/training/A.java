package ru.ya.training;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int v = scanner.nextInt();
        int q = scanner.nextInt();
        int m = scanner.nextInt();

        int vmTotalTrees = 2 * (v + m + 1);
        int intersectionBottomBorder = Math.max(p - v, q - m);
        int intersectionUpperBorder = Math.min(p + v, q + m);
        int intersectionTrees = Math.max(0, intersectionUpperBorder - intersectionBottomBorder + 1);

        System.out.println(vmTotalTrees - intersectionTrees);
    }
}
