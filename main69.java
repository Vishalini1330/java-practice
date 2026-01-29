import java.util.Scanner;
public class main69{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter for A: ");
        for(int k=0;k<n;k++){
            a[k]=in.nextInt();
        }
        System.out.println("enter the position to delete: ");
        int position = in.nextInt();
        if(position<0 || position>=n){
            System.out.println("invalid position");
        }
        else{
            for(int i=position-1;i<n-1;i++){
                a[i]=a[i+1];
            }
            n--;
            for(int i=0;i<n;i++){
                System.out.print(a[i] + " ");
            }
        }
    }
}