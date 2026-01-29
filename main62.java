import java.util.Scanner;
public class main62 {
    public static void main(String[] args) {
        int[] a = {10,3,4,5,-9,6};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int temp;
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }
    }
}