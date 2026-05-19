class Solution {
    public void dfs(int [][] image , int sr , int sc ,int n , int m, int color , int originalColor){
        if(sr < 0 || sc < 0 ||sr >= n || sc >= m) return;
        

        if(image[sr][sc] != originalColor) return;
        image[sr][sc] = color;
        
        // left
         dfs(image,sr,sc-1,n,m,color,originalColor);
        
        //right
         dfs(image,sr,sc+1,n,m,color,originalColor);
        
        // up
         dfs(image,sr-1,sc,n,m,color,originalColor);
        
        // down
         dfs(image,sr+1,sc,n,m,color,originalColor);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor == color) return image;
        int n = image.length;
        int m = image[0].length;
        dfs(image,sr,sc,n,m,color,originalColor);
        return image;
    }
}