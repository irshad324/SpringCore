public interface MultipleInh {
    void A();
        
     
}
 interface MUl2 {
   public void Show();
        
    }  



class   Mult3 implements MultipleInh,MUl2{

        public  void Show(){
            System.out.println("B");
          }

             public void A()    {
            System.out.println("A");
          }
  /*  public static void main(String[] args) {
    Mult3 M3=new Mult3();
    M3.A();
    M3.Show();
   }*/


}

       class Total{
        public static void main(String[] args) {
            Mult3 M3=new Mult3();
            M3.Show();
            M3.A();
        }
       }