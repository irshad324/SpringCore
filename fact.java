import java.util.Scanner;

public class fact {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Num");
    int a=sc.nextInt();
     int fact =1;
                                                ///THIS IS FACTORIAL
     for(int i = 1; i<=a;i++){
          fact=fact*i;
     }
        System.out.println("factoric of"+"a"+"is"+fact);

        /*  for(int i = 5; i>=1; i--){
                 fact=fact*i;
         }
         System.out.println(fact);*/

}
}
