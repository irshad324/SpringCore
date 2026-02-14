public class Methodee {
void run( String Name , int distance_Km){
    System.out.println( "Buzo is running"+distance_Km );
}

void eat(  String Name ){
    System.out.println("Jumbo is eatting  -->  "+Name);
}



    public static void main(String[] args) {
        Methodee M1=new Methodee();
        M1.run("Buzo" ,20);
         M1.eat("Meats"); 
        Methodee M2= new Methodee();
        M2.run("Buzz"+"\n" ,20);
        M2.eat("Meats");

    }
}

