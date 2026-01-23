import java.util.Arrays;
public class rotation{
    public static void main(String args[]){
        int arr[] = {5,2,8,3,1,9,4};
        int d = -1;
        if(d < 0)
            d = d + arr.length;
            d = d % arr.length;  
            for(int j=0; j<d; j++){
                int temp = arr[0];
                for(int i=1; i<arr.length; i++){
                    arr[i-1] = arr[i];
                }
                arr[arr.length-1] = temp;
                System.out.println(Arrays.toString(arr));
            }
        }

    }

