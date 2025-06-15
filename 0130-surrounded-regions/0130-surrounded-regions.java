class Solution {
    static void dfs(int i , int j, int[][] vis, char[][] board, int dumrow[], int dumclm[]){
        int m = board.length;
        int n = board[0].length;
        vis[i][j] = 1;
        int row = i;
        int clm = j;
        for(int k = 0 ; k < 4 ; k++){
            int nrow = i + dumrow[k];
            int ncol = j + dumclm[k];

            if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n
                && board[nrow][ncol] == 'O' && vis[nrow][ncol] == 0){
                dfs(nrow, ncol, vis, board, dumrow, dumclm);
            }
        }
    }
    static void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int dumrow[] = {-1,0,+1,0};
        int dumclm[] = {0,1,0,-1};
        int[][] vis = new int[m][n];
        for(int i = 0; i < m; i++){
            if( board[i][0] == 'O'&& vis[i][0] == 0) {
                dfs(i,0,vis,board,dumrow,dumclm);
            }
            if(board[i][n-1] == 'O' && vis[i][n-1] == 0) {
                dfs(i,n-1,vis,board,dumrow,dumclm);
            }
        }
        for(int j = 0; j < n; j++){
            if(board[0][j] == 'O') {
                dfs(0,j,vis,board,dumrow,dumclm);
            }
            if(board[m-1][j] == 'O') {
                dfs(m-1,j,vis,board,dumrow,dumclm);
            }
        }
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(board[i][j] == 'O' && vis[i][j] == 0){
                    board[i][j] = 'X';
                }
            }
        }
        // return board;
    }
}