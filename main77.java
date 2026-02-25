public class main77{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;
        int pro = 1;
        for(int i=n-1; i>=0; i--) {
            pro *= a[i];   
            if(i != n-1) { 
                System.out.print(pro);
                if(i != 1)
                    System.out.print(",");
            }
        }
    }
}