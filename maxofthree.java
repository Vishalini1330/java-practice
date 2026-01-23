public class maxofthree{
    public static void main(String args[]){
        int a = 10;
        int b = 50;
        int c = 34;
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}