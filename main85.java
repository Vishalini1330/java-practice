import java.util.Scanner;
public class main85{
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c= in.nextInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;i++){
            System.out.println("enter c: ");
            a[i] = new int[c];
            for(int j=0;j<c;j++){
               a[i][j] = in.nextInt();
            }
        }
        int[][] b = new int[c][r];
        System.out.println("matrix: ");
        for(int k=0;k<c;k++){
            for(int l=0;l<r;l++){
                b[k][l] = a[l][k];
                System.out.print(b[k][l] + " ");
            }
            System.out.println();
        }
    }
}