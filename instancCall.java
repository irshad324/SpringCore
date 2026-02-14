public class instancCall {
    int a= 10;
    static int b= 100;
          static String name="Hello irshad";
        String n="Hello";
    
    public static void main(String[] args) {
        instancCall I=new instancCall();
        System.out.println(name);
        System.out.println(instancCall.b);
          System.out.println(I.a);
          System.out.println(I.n);
    }
}
