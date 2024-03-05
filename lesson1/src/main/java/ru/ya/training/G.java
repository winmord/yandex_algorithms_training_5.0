package ru.ya.training;

import java.util.Scanner;

public class G {
    private static final double GOLDEN_RATIO = 1.618;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int p = scanner.nextInt();

        int enemies = 0;
        int result = 0;

        while (y > 0 || enemies > 0) {
            if (enemies == 0) {
                y -= x;
            } else if (y >= x) {
                if (enemies < x) {
                    y -= x - enemies;
                    enemies = 0;
                } else {
                    result = -1;
                    break;
                }
            } else {
                double ratio = (double) (y + enemies) / (double) (x);
                if ( ratio >= 1. && ratio <= GOLDEN_RATIO) {
                    enemies -= x - y;
                    y = 0;
                } else if (enemies < x) {
                    y -= x - enemies;
                    enemies = 0;
                }
            }

            x -= enemies;

            if (x < 0) {
                result = -1;
                break;
            }

            if (y > 0) {
                enemies += p;
            }
            ++result;
        }

        System.out.println(result);
    }
}
