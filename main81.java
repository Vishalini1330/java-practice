import java.util.Scanner;
public class main81{
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter r1 and c1: ");
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        System.out.println("enter r2 and c2: ");
        int r2 = in.nextInt();
        int c2 = in.nextInt();
        if(r1 != r2 || c1 != c2){
            System.out.println("Multiplication not possible");
            return;
        }
        int[][] a = new int[3][];
        int[][] b = new int[3][];
        int[][] c = new int[3][3];
        for(int i=0;i<r1;i++){
            System.out.println("enter c1: ");
            a[i] = new int[c1];
            for(int j=0;j<c1;j++){
               a[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<r2;i++){
            System.out.println("enter c2: ");
            b[i] = new int[c2];
            for(int j=0;j<c2;j++){
               b[i][j] = in.nextInt();
            }
        }
        System.out.println("matrix: ");
        for(int k=0;k<r1;k++){
            for(int l=0;l<c1;l++){
                c[k][l] = a[k][l] * b[l][k];
                System.out.print(c[k][l] + " ");
            }
            System.out.println();
        }
    }
}