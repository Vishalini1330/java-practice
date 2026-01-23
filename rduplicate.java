class removing{
    public int removeduplicate(int arr[]){
        if(arr.length == 0){
            return 0;
        }
        int j = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
    
}
public class rduplicate{
    public static void main(String args[]){
        int arr[] = {2,2,3,3,4,5,5,6};
        removing obj = new removing();
        int rd = obj.removeduplicate(arr);
        System.out.println("array after removing duplicates:");
        for(int i=0; i < rd; i++){
            System.out.print(arr[i]);
        }
    }
}