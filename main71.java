import java.util.Scanner;
public class main71{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter for A: ");
        for(int k=0;k<n;k++){
            a[k]=in.nextInt();
        }
        int count1 = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] % 2 == 0){
                count1+=1;
            }
        }
        System.out.println("even count is: " + count1);
        int count2 = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] % 2 != 0){
                count2+=1;
            }
        }
        System.out.println("odd count is: " + count2);
    }
}