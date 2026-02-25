import java.util.Scanner;
public class main86{
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
        int sum = 0;
        int max = 0;
        int row = 0;
        for(int k=0;k<a.length;k++){
            sum = 0;
            for(int l=0;l<a[k].length;l++){
                sum += a[k][l];
                }
            if(sum>max){
                max = sum;
                row = k+1;
            }
        }
        System.out.println("row with maximum sum is " + max +" in row " + row);
    }
}