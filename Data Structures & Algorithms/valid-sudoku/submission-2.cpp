class Solution {
private:
    bool isValidRow(vector<vector<char>>& board, int row) {
        set<char>s;
        for(int i=0; i<9; i++) {
            if(board[row][i]!='.') {
                if(s.contains(board[row][i])) {
                    return false;
                }
                s.insert(board[row][i]);
            }
        }
        return true;
    }

    bool isValidCol(vector<vector<char>>& board, int col) {
        set<char>s;
        for(int i=0; i<9; i++) {
            if(board[i][col]!='.') {
                if(s.contains(board[i][col])) {
                    return false;
                }
                s.insert(board[i][col]);
            }
        }
        return true;
    }

    bool isValidBox(vector<vector<char>>& board, int row, int col) {
        set<char>s;
        for(int i=row; i<row+3; i++) {
            for(int j=col; j<col+3; j++) {
                if(board[i][j]!='.') {
                    if(s.contains(board[i][j])) {
                        return false;
                    }
                    s.insert(board[i][j]);
                }
            }
        }
        return true;
    }

public:
    bool isValidSudoku(vector<vector<char>>& board) {
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
            for(int j=0; j<3; j++)
            if(!isValidBox(board, 3*i, 3*j)) {
                return false;
            }
        }
        return true;
    }
};
