public class Method4 {
    int No_of_Eyes;
    String Colour;

void Details( String Name){

           System.out.println("Details---------"+Name+"Detail--------");
         
    System.out.println( "eyes --------"+ No_of_Eyes);
    System.out.println(" Colour ------" +Colour);

}
    public static void main(String[] args) {
        Method4 Jumbo=new Method4();
           Jumbo.No_of_Eyes=2;
           Jumbo.Colour="Brown";
           Jumbo.Details("Jumbo");

           Method4 Buzo=new Method4();
           Buzo.No_of_Eyes=2;
           Buzo.Colour="Black";
           Buzo.Details("Buzo");

    
    }

}
