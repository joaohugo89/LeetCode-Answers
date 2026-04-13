import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                if (c == '.') continue;

                if (set.contains(c)) return false;
                set.add(c);
            }
        }

        for (int j = 0; j < 9; j++) {
            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                char c = board[i][j];

                if (c == '.') continue;

                if (set.contains(c)) return false;
                set.add(c);
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        char c = board[i + x][j + y];

                        if (c == '.') continue;

                        if (set.contains(c)) return false;
                        set.add(c);
                    }
                }
            }
        }

        return true;
    }
}