import java.util.Scanner;
public class main84{
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
        int largest = a[0][0];
        for(int k=0;k<a.length;k++){
            for(int l=0;l<a[k].length;l++){
                if(a[k][l]>largest){
                    largest = a[k][l];
                }
            }
        }
        System.out.println(largest);
    }
}