public class maxelement{
    public static void main(String args[]){
        int arr[] = {5,2,8,3,1,9,4};
       int i, max=0;
       for(i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
        System.out.println("maximum element is:" + max);
    }
}