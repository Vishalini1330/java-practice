import java.util.Scanner;
public class main70{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter for A: ");
        for(int k=0;k<n;k++){
            a[k]=in.nextInt();
        }
        System.out.println("enter the element: ");
        int element = in.nextInt();
        for(int i=0;i<a.length;i++){
            if(element == a[i]){
                System.out.println("the element " +a[i]+ "found at index "+  "=" + i);
            }
        }
        
    }
}