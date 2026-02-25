import java.util.Scanner;
public class main88{
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
        System.out.println("No of rotations: ");
        int n = in.nextInt();
        for(int k=r-1;k>=0;k--){
            for(int l=c-1;l>=0;l--){
                System.out.print(a[k][l]+ " ");
            }
            System.out.println(" ");
        }
    }
}