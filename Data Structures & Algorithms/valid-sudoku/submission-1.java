class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++) {
            if(!isValidRow(board, i)) {
                return false;
            }
        }
        for(int i=0; i<9; i++) {
            if(!isValidCol(board, i)) {
                return false;
            }
        }
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(!isValidBox(board, 3*i, 3*j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidRow(char[][] board, int row) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<9; i++) {
            if(board[row][i]!='.') {
                if (set.contains(board[row][i])) {
                    return false;
                }
                set.add(board[row][i]);
            }
        }
        return true;
    }

    private static boolean isValidCol(char[][] board, int col) {
        Set<Character>set = new HashSet<>();
        for(int i=0; i<9; i++) {
            if(board[i][col]!='.') {
                if (set.contains(board[i][col])) {
                    return false;
                }
                set.add(board[i][col]);
            }
        }
        return true;
    }

    private static boolean isValidBox(char[][] board, int row, int col) {
        Set<Character>set = new HashSet<>();
        for(int i=row; i<row+3; i++) {
            for(int j=col; j<col+3; j++) {
                if (board[i][j]!='.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
}