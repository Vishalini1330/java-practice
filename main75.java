import java.util.Scanner;
public class main75{
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {2,4,3,1};
        int n=a.length;
        if(a.length != b.length){
            System.out.println("Invalid arrays");
            return;
        }
        boolean rot = false;
        for(int i=0;i<n;i++){
            if(b[i]==a[0]){
                int j;
                for(j=0;j<n;j++){
                    if(a[j]!=b[(i+j)%n]){
                        break;
                    }
                }
                if(j==n){
                    rot =true;
                    break;
                }
            }
        }
            if(rot)
                System.out.println("Rotation");
            else
                System.out.println("Not a rotation of a");
    }
}