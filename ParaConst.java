public class ParaConst {
    int n;
    String name;

      ParaConst(int rollno,String namee ){
                 n=rollno;
                // System.out.println(rollno);
                 name=namee;
                // System.out.println(namee);
      }


public static void main(String[] args) {
    ParaConst obj=new ParaConst( 101,"irshsd");
              System.out.println(obj.n+""+":"+obj.name);
    ParaConst objj=new ParaConst(102, "Sufiyan");
    System.out.println(objj.n+""+":"+objj.name);
    ParaConst obj3 =new ParaConst(103, "israr");
    System.out.println(obj3.n+":"+obj3.name);


}



}
