import java.util.Scanner;
public class main92{
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||j==0||i==row-1||j==col-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}