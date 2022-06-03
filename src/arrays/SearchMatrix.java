package arrays;

import java.util.Scanner;

public class SearchMatrix {
    public static boolean solve(int[][]matrix,int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low=0,high=rows*cols-1;
        while(low<=high){
            int mid = (low+high)/2;
            int r = mid/cols;
            int c = mid%cols;
            
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                high=mid-1;
            }
            else{
                low=mid+1;   
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][]matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(solve(matrix, target));
        sc.close();
    }
}
