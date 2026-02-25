import java.util.Scanner;
public class main93{
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        int row = matrix.length;
        int col = matrix[0].length;
        spiraltraversal(matrix,row,col);
    }
    public static void spiraltraversal(int[][] matrix, int row,int col){
        int i = 0, j = 0;
        while(i < row && j < col){
            for(int k = j; k < col; k++){
                System.out.print(matrix[i][k] + " ");
            }
            i++;
            for(int k = i; k < row; k++){
                System.out.print(matrix[k][col-1] + " ");
            }
            col--;
            if(i < row){
                for(int k = col-1; k >= j; k--){
                    System.out.print(matrix[row-1][k] + " ");
                }
                row--;
            }
            if(j < col){
                for(int k = row-1; k >= i; k--){
                    System.out.print(matrix[k][j] + " ");
                }
                j++;
            }
        }
    }
}