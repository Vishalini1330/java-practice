import java.util.Scanner;
public class main60 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /*for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }*/
        System.out.print("\nArray elements:\n");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}