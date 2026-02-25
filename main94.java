import java.util.Scanner;
public class main94{
    public static void main(String[] args){
        int[][] a = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
        int row = a.length;
        int col = a[0].length;
        for(int i=0;i<row;i++){
            for(int j=col-1;j>=0;j--){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}