public class CTOverLoading {
    
    void show( String b){
     System.out.println(2);
    }
       
     void show(double a){

       System.out.println(1);

     }
public static void main(String[] args) {
    CTOverLoading p = new CTOverLoading();
    p.show('a');
}


}
