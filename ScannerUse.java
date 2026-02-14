import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        System.out.println("Enter Any Name");
                

        String name=S.nextLine();
        System.out.println("Print-"+name);
        String Name;
        String CdN;
        System.out.println("Enter 2nd");
        Name=S.next();
        
        System.out.println(Name);
       System.out.println("----------------------");
        
        int Age;
        int Roll;
    
        Scanner Ar = new Scanner(System.in);
        System.out.println("Enter Age");
        Age=S.nextInt();
        System.out.println( "Enter Roll"   );
        Roll=S.nextInt();
        int sum= Age+Roll;
        System.out.println(Age);
        System.out.println(Roll);
        System.out.println(sum);
           
        float digit; 
        System.out.println("Enter digit");
        digit=S.nextFloat();
        System.out.println(digit);
        boolean k=S.nextBoolean();
        System.out.println(k);


        
    }
}
