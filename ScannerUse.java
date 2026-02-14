   import java.util.Scanner;
 public class ScannerUse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
        String Name=s.nextLine();
        System.out.println("Enter age");
        int age=s.nextInt();
        System.out.println("Enter Phone No");
        Long Phone_N=s.nextLong();
        System.out.println("enter gender");
        char Gender=s.next().charAt(0);
        System.out.println("Enter True false");
        boolean TF=s.nextBoolean();
           System.out.println("-------------------------------------------------------");
        System.out.println("Name:"+Name);
        System.out.println("age:"+age);
        System.out.println("Phone:"+Phone_N);
        System.out.println("Gender:"+Gender);
        System.out.println("boolean:"+TF);

    
        
    }
}
