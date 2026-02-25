import java.util.Scanner;
public class main78{
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               a[i][j] = in.nextInt();
               }
        }
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                System.out.print(a[k][l] + " ");
            }
            System.out.println();

        }
        
    }
}