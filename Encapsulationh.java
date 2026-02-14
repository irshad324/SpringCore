public class Encapsulationh {
    private int id;
public void Setid(int a){
    id= a;

}

public int Getid(){
    return id;
}

}
  class N{
public static void main(String[] args) {
    Encapsulationh S = new Encapsulationh();
    S.Setid(23333);
    System.out.println(S.Getid());
}

  }