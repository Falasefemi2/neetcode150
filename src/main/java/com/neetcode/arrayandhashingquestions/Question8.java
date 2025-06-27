package com.neetcode.arrayandhashingquestions;

import java.util.HashSet;
import java.util.Set;

public class Question8 {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boards = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boards[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];

                if (val == '.')
                    continue;

                if (rows[i].contains(val)) {
                    return false;
                }
                rows[i].add(val);

                if (cols[j].contains(val)) {
                    return false;
                }
                cols[j].add(val);

                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boards[boxIndex].contains(val)) {
                    return false;
                }
                boards[boxIndex].add(val);
            }
        }
        return true;
    }
}
