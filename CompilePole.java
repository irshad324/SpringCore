public class CompilePole {
void show(int a ){
         System.out.println(a);   
    }
void  show(int b, int s){                                                    //This is overloading compile time polymorphism
          System.out.println(b);
          System.out.println(s)  
} 
    public static void main(String[] args) {
        CompilePole com=new CompilePole(); 
        com.show(12);
        com.show(20,29);
            
        }
    
    
}
