public interface InterfaceC {
        public static final int a=10;                       // By default ( public static final   int a=10; ) ////is creat 
        
void show();
}
     
     

class  show implements InterfaceC{

       public void show(){
        System.out.println("Hello Interface");
       }
}



     class  FixBycall  {
        public static void main(String[] args) {
            //InterfaceC I=new InterfaceC();                      //No declear object interface 
             
                 show  s=new  show();
                 s.show();
                 System.out.println(s.a);

            

        }
     }
