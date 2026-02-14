     abstract  class Abstructions{
        abstract void startBike();
               void  runCycle(){
            System.out.println("Run Cycle");
        }

} 
class    car extends Abstructions{
       void startBike(){
        System.out.println("Hello Abstruction  Sucssecfull Implementation ");
       }

       void  show(){
        System.out.println("Hello");
       }
}

    class Scooter   extends Abstructions{
        void startBike(){
        System.out.println("start bike by key ");
       }
    }

      class MainCall{
        public static void main(String[] args) {
           car  c=new car();
            c.startBike();
            c.runCycle();

               Abstructions a=new car();
                a.startBike();

                Scooter S=new Scooter();
                S.startBike();
            

                
               

        }
      }