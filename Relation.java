public class Relation {
    

    public static void main(String[] args) {
        boolean a=false,b=false, c=true,d= true,e;
    
            
         //System.out.println((23<34) && c);
         System.out.println( a==b);     // true;
         System.out.println(a&&b);  //false
         System.out.println(a&&d);   //false
         System.out.println(d&&c);   //true

         System.out.println(a||b);      // false
         System.out.println(c||a); // true
         System.out.println(!a); // true
         System.out.println(c||d);  //true
         System.out.println(!c);          // false
         System.out.println();
    }
}
