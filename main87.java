import java.util.Scanner;
public class main87{
public static void main(String[] args) {
        int[][] a = new int[3][];
        int r,c; 
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        c= in.nextInt();
        for(int i=0;i<r;i++){
            System.out.println("enter c: ");
            a[i] = new int[c];
            for(int j=0;j<c;j++){
               a[i][j] = in.nextInt();
            }
        }
        for(int k=0;k<r;k++){
            for(int l=0;l<c;l++){
                int temp = a[k][l];
                a[k][l] = a[r-1][l];
                a[r-1][l] = temp;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
