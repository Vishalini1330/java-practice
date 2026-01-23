public class minelement{
    public static void main(String args[]){
        int arr[] = {5,2,8,3,1,9,4};
       int i,min=arr[0];
       for(i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
       }
        System.out.println("minimum element is:" + min);
    }
}