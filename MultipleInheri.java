      
      interface MultipleInheri {

          void show();
}
  interface  Dog    {
         void cat();
      }
      class  Lion  implements Dog,MultipleInheri{
                    public void show(){
                    System.out.println("Show your phonr");
                 }
                  public void cat(){
                    System.out.println("Cat is running");
                 }
        
        
      }

           class  MultipleInheri3{
            
            public static void main(String[] args) {
                Lion L=new Lion();
                L.show();
            
            }
          }

    

















    