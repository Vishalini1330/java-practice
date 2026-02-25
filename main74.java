import java.util.Scanner;
public class main74{
    public static void main(String[] args) {
        int[] a = {1,15,9,6,7};
        int min = a[0];
        int secmin = Integer.MAX_VALUE;
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                secmin = min;
                min = a[i];
            }
            else if(a[i]<secmin){
                secmin = a[i];
            }
        }
        System.out.println(secmin);
    }
}
        