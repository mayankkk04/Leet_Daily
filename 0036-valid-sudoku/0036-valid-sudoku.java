class Solution {
    private boolean Traversal(char[][] board, int sr, int er, int sc, int ec){
        HashSet<Character> set = new HashSet<>();
        for(int i = sr ; i <= er ; i++){
            for(int j = sc ; j <= ec ; j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

        //Check all rows
        for(int row = 0 ; row < n ; row++){
            HashSet<Character> set = new HashSet<>();
            for(int clm = 0 ; clm < n ; clm++){
                if(board[row][clm] == '.') continue;
                if(set.contains(board[row][clm])) return false;
                set.add(board[row][clm]);
            }
        }
        //Check all columns
        for(int clm = 0 ; clm < n ; clm++){
            HashSet<Character> set = new HashSet<>();
            for(int row = 0 ; row < n ; row++){
                if(board[row][clm] == '.') continue;
                if(set.contains(board[row][clm])) return false;
                set.add(board[row][clm]);
            }
        }
        //Check Boxes
        for(int sr = 0 ; sr < 9 ; sr+=3){
            int er = sr+2;
            for(int sc = 0 ; sc < 9 ; sc+=3){
                int ec = sc+2;
                if (!Traversal(board, sr, er, sc, ec)) return false;
            }
        }
        return true;
    }
}