import java.util.Scanner;
public class main64{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = in.nextInt();
        int[] a = new int[n];
        for(int k=0; k<n; k++){
            a[k] = in.nextInt();
        }
        for(int i=0,j=a.length-1; i<j; i++,j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}