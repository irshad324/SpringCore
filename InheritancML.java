public class InheritancML {
   void Phone_charger(){
    System.out.println("Phone Charger");
   }
    
}

      class Phone1 extends InheritancML{
                int    show(){
                    System.out.println("Phone1");
                    return 0;
                }
      }



        class Phone2 extends Phone1{
              void Name(){
                System.out.println("Hello");
              }  
        }



              class Mainclass {
            public static void main(String[] args) {
                 Phone1 P1=new Phone1();
                 //P1.Phone_charger();
                 //P1.show();
                 Phone2 P2 =new Phone2();
                 P2.show();
                  P2.Phone_charger();
                 
            }
        }
      
        
      

    


    

