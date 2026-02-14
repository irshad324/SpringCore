public class InheritanceABC {

    
 public void run(){

    System.out.println("Dog is Running");
 } void birds(){

    System.out.println("fly"); 
    System.out.println("Hey");
}
  
}
    
class g extends InheritanceABC    {

void show(){
    System.out.println("Good ");
}

void name(){
System.out.println("Irshad");

}

public static void main(String[] args) {
    g All = new g();
    All.birds();
    All.show();
    InheritanceABC h = new InheritanceABC();
    h.run();
}

}



    



