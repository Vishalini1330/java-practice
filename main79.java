import java.util.Scanner;
public class main79{
public static void main(String[] args) {
        int[][] a = new int[3][];
        int r,c; 
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        for(int i=0;i<r;i++){
            System.out.println("enter c: ");
            c= in.nextInt();
            a[i] = new int[c];
            for(int j=0;j<c;j++){
               a[i][j] = in.nextInt();
            }
        }
        System.out.println("matrix: ");
        for(int k=0;k<a.length;k++){
            for(int l=0;l<a[k].length;l++){
                System.out.print(a[k][l] + " ");
            }
            System.out.println();
        }
    }
}