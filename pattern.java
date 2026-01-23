public class pattern {
    public static void main(String args[]) {
        int n = 1;
        while(n <= 5) {   // run until n reaches 1
            int m = 1;
            while(m <= n) {
                System.out.print("*");
                m++;
            }
            System.out.println();
            n++;          // decrease n
        }
    }
    import java.util.reversearray;
   public static void main2(String args[]){
        int i = 5;
        while(i >= 1){
            int j = 1;
            while(j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

    }
}