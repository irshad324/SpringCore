public class SMethod {
    void show(){
        System.out.println(" show me your phone");
    }

    void Phone_Part(){
        String Details="Phone Some Details";
        String Brand="     Brand I Phone";
        String Part1="  I Phone folder";
        String Part2="  I Phone Body";
        String Battery=" i Phone Battery MAh 3700";
        String size="Phone size";
        
        double PhoneSize=6.7;


        System.out.println(Details+"\n"+Brand+"\n"+Part1+"\n"+ Part2+"\n"+Battery+"\n"+size+"\n"+PhoneSize);
    }

    public static void main(String[] args) {
        SMethod call=new SMethod();
        call.show();
        call.Phone_Part();
    }
}
