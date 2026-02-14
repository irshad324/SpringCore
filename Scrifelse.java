import java.util.Scanner;
public class Scrifelse {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Age");
         int age=sc.nextInt();
        
         if(age>=18){
            System.out.println(" So you are adult");
         }else{
            System.out.println("Not adult");
         }

    }
}
