import java.util.Scanner;
public class main67{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("enter for A: ");
        for(int k=0;k<n;k++){
            a[k]=in.nextInt();
        }
        System.out.println("enter for B: ");
        for(int k=0;k<n;k++){
            b[k]=in.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
            for(int j=i;j<b.length;j++){
                System.out.print(b[j] + " ");
                break;
            }
        }
    }
}