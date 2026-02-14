import java.util.Scanner;

public class Sym {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter first no");
         float a= s.nextFloat();
         System.out.println("Enter second no");
         float b=s.nextFloat();
         System.out.println("Enter Choice  Symbal(+,-,*,/,%,.,)");
     String sym=s.next();
      float rsu;
               

           switch (sym) {
                   case  "+": rsu=a+b; 
                   System.out.println("Addition"+rsu); 
                   break;
                   case "-": rsu=a-b;
                   System.out.println("Subtraction"+rsu);

                   break;
                   case "*": rsu= a*b;
                   System.out.println("Multipication"+rsu);
                   break;
                   case "/":rsu=a/b; 
                   System.out.println("division"+rsu);
                   break;
                    case "%": rsu=a%b;
                    System.out.println("Enter Reminder"+rsu);
                      break;
                   default:
                   System.out.println("Invalid calculation");             
                     break;
                



           }

    }
}
