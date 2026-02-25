import java.util.Scanner;
public class main76{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n=a.length;
        for(int i=0;i<a.length-1;i++){
            boolean v = true;
            for(int j=i+1;j<a.length;j++){
                if(a[i] < a[j]){
                    v = false;
                    break;
                }
            }
            if(v){
                System.out.print(a[i]);
            }
        }
    }
}