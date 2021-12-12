package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        if (checkVert(board) || checkHoriz(board)) {
            rsl = true;
        }
        return rsl;
    }

    private static boolean checkVert (int[][] board) {
        boolean rsl = false;
        int count;
        for (int i = 0; i<board[0].length; i++) {
            count = 0;
            if (board[0][i]==1) {
                count++;
                for (int k = 1; k<board.length; k++) {
                    if (board[k][i]==1) {
                        count++;
                    }
                }
            }
            if (count==board.length) {
                rsl = true;
            }
        }
        return rsl;
    }

    private static boolean checkHoriz (int[][] board) {
        boolean rsl = false;
        int count;
        for (int i = 0; i<board.length; i++) {
            count = 0;
            if (board[i][0]==1) {
                count++;
                for (int k = 1; k<board[0].length; k++) {
                    if (board[i][k]==1) {
                        count++;
                    }
                }
            }
            if (count==board[0].length) {
                rsl = true;
            }
        }
        return rsl;
    }
}
