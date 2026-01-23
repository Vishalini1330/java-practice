public class rotatearray{
    public static void main(String args[]){ 
        int arr[] = {5,2,8,3,1,9,4};
        int n = arr.length;
        int k = 3;//number of rotations
        k = k % n; // in case k is greater than n
        //rotate array
        int temp[] = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = arr[n - k + i];
        }
        for(int i = n - 1; i >= k; i--){
            arr[i] = arr[i - k];
        }
        for(int i = 0; i < k; i++){
            arr[i] = temp[i];
        }
        //print rotated array
        System.out.println("rotated array is: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
       