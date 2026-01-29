import java.util.Scanner;
public class main68{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter for A: ");
        for(int k=0;k<n;k++){
            a[k]=in.nextInt();
        }
        boolean[] v = new boolean[a.length];
        for(int i=0;i<a.length;i++){
            if(v[i] == true){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    count += 1;
                    v[j] = true;
                }
            }
            System.out.println("frequency of" + a[i] + "=" + count);
        }
    }
}