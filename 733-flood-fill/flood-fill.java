class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor=image[sr][sc];
        if(originalColor==color){
            return image;
        }
        backtrack(image,sr,sc,originalColor,color);
        return image;
    }
        public void backtrack(int[][] image,int row,int col,int original,int color){
            
             if(row<0 || row>=image.length || col<0 || 
                col>=image[0].length || image[row][col]!=original){
                    return;
                }

                image[row][col]=color;
                backtrack(image,row+1,col,original,color);
                backtrack(image,row,col+1,original,color);
                backtrack(image,row-1,col,original,color);
                backtrack(image,row,col-1,original,color);
        }
        
    }
