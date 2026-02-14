import java.util.Scanner;

public class CalUser {
    public static void main(String[] args) {
    
        Scanner Use=new Scanner(System.in);
           System.out.println("Enter  first N");
        int N=Use.nextInt();
        System.out.println("Enter Second N");
        int N2=Use.nextInt();
        System.out.println("Select Number(+,-,*,%,)");
        String Sym=Use.next();
        int res;
              switch (Sym) {
                       case "+":res= N+N2;
                       System.out.println("Addition is"+res);
                       break;
                       case "-": res=N-N2;
                       System.out.println("Minus"+res);
                       break;
                       case "*": res=N*N2;
                         System.out.println("Multi"+res);
                         break;
                         case "%":res=N%N2;
                         System.out.println("Moduals"+res);
                         break;
                         default:
                         System.out.println("Invailad Sym");
                            break;
              }
    }
}
