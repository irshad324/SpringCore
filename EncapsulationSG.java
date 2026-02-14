public class EncapsulationSG {

       private int emply_id;

public void  Setemply_id(int ide){
    emply_id = ide;
}

public int Getemply_id (){
    return  emply_id ;
}

}


class  Main{
    public static void main(String[] args) {
        EncapsulationSG E=new EncapsulationSG();
        E.Setemply_id(100);
         System.out.println(E.Getemply_id());
    }
}
