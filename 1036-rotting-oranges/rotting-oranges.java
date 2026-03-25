class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int count=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    count++;
                }
                else if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(count==0){
            return 0;
        }
        int time=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int currLoc[]=q.poll();
                int r=currLoc[0];
                int c=currLoc[1];
                int dir[][]={{r-1,c},{r,c-1},{r+1,c},{r,c+1}};
                for(int[] nums:dir){
                    int nr=nums[0];
                    int nc=nums[1];
                    if(nr<0 || nr>=row || nc<0 || nc>=col || grid[nr][nc]==0 || grid[nr][nc]==2){
                        continue;
                    }
                    q.offer(new int[]{nr,nc});
                    grid[nr][nc]=2;
                    if(--count==0){
                        return time+1;
                    }
                }
            }
            time++;
        }
        return (count==0)?time:-1;
        
    }
}