import java.util.Scanner;

public class Scr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Any Num");
        int num=sc.nextInt();
        System.out.println("enter 2nd Num");
        int num2=sc.nextInt();
        System.out.print("Sum Is--");
        int sum=num+num2;
        System.out.println(sum);
    }
}
