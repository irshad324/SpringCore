public class Metho3 {
    int No_of_Eyes=2;                   // this is wrong  way becase   1 and  2 object create time  on same  same print 
    String Colour="Brown";


    void Jumbo(){
        System.out.println("Jumbo is ");
    }


public static void main(String[] args) {
    Metho3 M=new Metho3();
     System.out.println(M.No_of_Eyes);
     System.out.println(M.Colour);

     Metho3 m1= new Metho3();
     System.out.println(m1.No_of_Eyes);
     System.out.println(m1.Colour);

}




}
