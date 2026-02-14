public class SuperKyWU {
    int no=10;

}

class  Seconde    extends SuperKyWU{
    int no=20;

    void show(int no){
              no=no;
              System.out.println(no);
        System.out.println(super.no);
        System.out.println(super.no);
        System.out.println(this.no);
    }


public static void main(String[] args) {
    Seconde obj=new Seconde();
    obj.show(100);
    
}



}
