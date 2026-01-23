public class binarysearch{
    public static int binarysearch(int arr[], int key){
        int low = 0; 
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                low = mid + 1;
                high = high;
            }
            else{
                high = mid - 1;
                low = low;

            }
            

        } 
        return -1;

    }
        

public static void main(String args[]){ 
        int arr[] = {5,2,8,3,1,9,4};
        int key = 9;
        System.out.println(binarysearch(arr,key));
        }
};


