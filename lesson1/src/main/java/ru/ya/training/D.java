package ru.ya.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[8][8];

        List<Figure> rooks = new ArrayList<>();
        List<Figure> bishops = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            String[] line = scanner.nextLine().split("");
            board[i] = line;

            for (int j = 0; j < 8; j++) {
                if ("R".equals(board[i][j])) {
                    rooks.add(new Figure(i, j));
                    board[i][j] = "C";
                } else if ("B".equals(board[i][j])) {
                    bishops.add(new Figure(i, j));
                    board[i][j] = "C";
                }
            }
        }

        for (Figure rook : rooks) {
            int x = rook.x();
            int y = rook.y();

            for (int i = 1; i < 8; i++) {
                if (x - i < 0 || "C".equals(board[x - i][y])) {
                    break;
                }
                board[x - i][y] = "-";
            }

            for (int i = x + 1; i < 8; i++) {
                if ("C".equals(board[i][y])) {
                    break;
                }
                board[i][y] = "-";
            }

            for (int i = 1; i < 8; i++) {
                if (y - i < 0 || "C".equals(board[x][y - i])) {
                    break;
                }
                board[x][y - i] = "-";
            }

            for (int i = y + 1; i < 8; i++) {
                if ("C".equals(board[x][i])) {
                    break;
                }
                board[x][i] = "-";
            }
        }

        for (Figure bishop : bishops) {
            int x = bishop.x();
            int y = bishop.y();

            for (int i = 1; i < 8; i++) {
                if (x - i < 0 || y - i < 0 || "C".equals(board[x - i][y - i])) {
                    break;
                }
                board[x - i][y - i] = "-";
            }

            for (int i = 1; i < 8; i++) {
                if (x + i > 7 || y + i > 7 || "C".equals(board[x + i][y + i])) {
                    break;
                }
                board[x + i][y + i] = "-";
            }

            for (int i = 1; i < 8; i++) {
                if (x - i < 0 || y + i > 7 || "C".equals(board[x - i][y + i])) {
                    break;
                }
                board[x - i][y + i] = "-";
            }

            for (int i = 1; i < 8; i++) {
                if (y - i < 0 || x + i > 7 || "C".equals(board[x + i][y - i])) {
                    break;
                }
                board[x + i][y - i] = "-";
            }
        }

        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ("*".equals(board[i][j])) {
                    ++count;
                }
            }
        }

        System.out.println(count);
    }

    private record Figure(int x, int y) {
    }
}
