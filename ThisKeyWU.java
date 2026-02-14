public class ThisKeyWU {
    int i;
    

    void nR(int i){
        this. i=i;
    }

    void show(){
        System.out.println(i);
    }


    public static void main(String[] args) {
        ThisKeyWU obj=new ThisKeyWU();
        obj.nR(10);
        obj.show();
    }
}
