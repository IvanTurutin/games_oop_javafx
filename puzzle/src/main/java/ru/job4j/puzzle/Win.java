package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkVert(board, i) || checkHoriz(board, i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkVert(int[][] board, int index) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][index] != 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkHoriz(int[][] board, int index) {
        for (int i = 0; i < board[index].length; i++) {
            if (board[index][i] != 1) {
                return false;
            }
        }
        return true;
    }
}
