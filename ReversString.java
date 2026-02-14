public class ReversString {
    public static void main(String[] args) {
        String Name= "israr";
        int leng=Name.length();
         String rev="";
          for(int i= leng-1;i>=0; i--){
              rev=rev+Name.charAt(i);
          }
          //System.out.print("Revers of"+Name+"is"+rev);
          System.out.println(rev);
}

}