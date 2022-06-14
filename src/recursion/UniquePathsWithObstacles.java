package recursion;

public class UniquePathsWithObstacles {
    public static int numOfPaths(int[][]arr,int r,int c,int i,int j) {
        if(i==r || j==c)return 0;
        if(arr[i][j]==1)return 0;
        if(i==r-1 && j==c-1)return 1;
        return numOfPaths(arr, r, c, i+1, j) + numOfPaths(arr, r, c, i, j+1);

    }
    public static int solve(int[][]arr) {
        int r = arr.length;
        int c = arr[0].length;
        return numOfPaths(arr, r, c, 0, 0);
    }
    public static void main(String[] args) {
        int[][]arr = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(solve(arr));
    }
}
