class Solution {
    int n;
    private void sortDiag(int row, int clm, int[][] grid, boolean ascend){
        ArrayList<Integer> list = new ArrayList<>();
        int i = row;
        int j = clm;

        while(i < n && j < n){
            list.add(grid[i][j]);
            i++;
            j++;
        }
        
        if(ascend){
            Collections.sort(list);
        }else{
            Collections.sort(list, Collections.reverseOrder());
        }

        i = row;
        j = clm;
        for (int k = 0; k < list.size(); k++) {
            grid[i][j] = list.get(k);
            i++;
            j++;
        }
    }

    public int[][] sortMatrix(int[][] grid) {
        n = grid.length;
        int row = 0;
        int clm = 0;

        //bottom-left
        for(row = 0 ; row < n ; row++){
            sortDiag(row,0,grid,false);
        }

        //top-right
        for(clm = 1 ; clm < n ; clm++){
            sortDiag(0,clm,grid,true);
        }

        return grid;

    }
}