class main{
    public static void main(String[] args){
        example obj1 = new example();
        example obj2 = new example();
        example.disp();
    }
}
class example{
    static int count;
    static{
        count=0;
        System.out.println("static members initialized");
    }
    example(){
        count = count+1;
    }
    static void disp(){
        System.out.print("count= "+count);
    }
}
