public class Tableof {
    public static void main(String[] args) {
        int a=5,Fact=1;
        for(int i=a; i>=1; i--){
            Fact=Fact*i;                                            //This is Factorial  10*9*8*7*6*5*4*3*2*1=3628800
        }
        //System.out.print("Fact of"+a+"is"+Fact);
        System.out.print(Fact);
    }
}
