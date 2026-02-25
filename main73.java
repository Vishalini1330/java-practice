import java.util.Scanner;
public class main73{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int[] a = new int[n];
        for(int k=0;k<n;k++){
            a[k]=in.nextInt();
        }
        System.out.println("enter k: ");
        int k = in.nextInt();
        int sum=0,len=0,l=0;
        for(int i=0;i<a.length;i++){
            sum = 0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum>=k){
                    if(sum==k){
                        l=j-i+1;
                    }
                    break;
                }
                if(l>len){
                    len=l;
                }
            }
        }
        System.out.print(len);
    }
}