import java.util.Scanner;
public class main72{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int[] a = new int[6];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<a.length;i++){
            a[i] = a[i-1]+a[i-2];
        }
        for(int k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }
    }
}