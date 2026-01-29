import java.util.Scanner;
public class main66{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,1,2,3,1,2,1,2};
        boolean[] v = new boolean[a.length];
        int count1 = 0;
        for(int i=0;i<a.length;i++){
            if(v[i] == true){
                continue;
            }
            count1 = 0;
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    count1+=1;
                    v[j] = true;
                }
            }
            if(count1 == 0){
                System.out.print(a[i] + " ");
            }
        }
    }
}