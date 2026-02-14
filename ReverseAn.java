public class ReverseAn {
    public static void main(String[] args) {
        int num =5432, rem, rev=0;
         while (num !=0) {
             rem= num %10;                 // Revere A Number
             rev=rev*10+rem;
             num=num/10;
         }
         System.out.println(rev);
    }
}
