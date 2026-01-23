 public class linearsearch{
    public static void main(String args[]){ 
        int arr[] = {5,2,8,3,1,9,4};
        int i, key = 9;
        for(i=0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("linear search value position is:" +i);
                break;
            }
        }
    }
}