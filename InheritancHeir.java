public class InheritancHeir {
    void show(){
        System.out.println("Show me your phone");
    }
}


class  MyNewPhone   extends  InheritancHeir{
    void Phone(){
    System.out.println("   Your 1 Phone is good ");
    }
}

class My2NewPhone extends InheritancHeir{
     void Phone2(){
        System.out.println("    your 2 phone is  good ");
     }
}


                 class Mainclas{
                    public static void main(String[] args) {
                        MyNewPhone M1=new MyNewPhone();
                        M1.show();M1.Phone();
                    }
                

                 }



                 
