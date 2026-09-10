import java.util.LinkedList;
import java.util.Queue;

public class IslandsandTreasure {
    private static final int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
    public void islandAndtresusre(int[][] grid){
        if(grid==null||grid.length==0) return;
        int row= grid.length,col= grid[0].length;
        Queue<int[]> queue =new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j]==0){
                    queue.add(new int[]{i,j});
                }
            }
        }
        while (!queue.isEmpty()){
            int[] current= queue.poll();
            int r=current[0],c=current[1];
            for(int[] dir:directions){
                int nextr=r+dir[0],nextc=c+dir[1];
                if(nextr<0||nextc<0||nextr>=row||nextc>=col||grid[nextr][nextc]==-1){
                   continue;
                }
                grid[nextr][nextc]=grid[r][c]+1;
                queue.add(new int[]{nextr,nextc});
            }
        }
    }
}
