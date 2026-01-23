import java.util.Arrays;
public class arrrotation{
    public static void main(String args[]){
        int arr[] = {5,2,8,3,1,9,4};
        int d = -3;
        if(d<0){
            d = d+arr.length;
        }
            d = d % arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
     public static void reverse(int arr[], int i, int j){
        while(i>j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
       }
    }