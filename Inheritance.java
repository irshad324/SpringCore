public class Inheritance {

    void eat(){
        System.out.println("Hello");
    }
}



class Dog  extends  Inheritance    {
       void dogrun(){
        System.out.println("Dog is running");
       }
}

     class Main{
        public static void main(String[] args) {
            Dog D=new Dog();
            D.eat();                                        // Dog is inherite super class 
            D.dogrun();
        }
     }