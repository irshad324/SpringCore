public class LeepYear {
    public static void main(String[] args) {
        int LeepYear=2016;
        if((LeepYear%400==0)    ||(LeepYear%4==0 && LeepYear%100!=0)){
            System.out.println("  This is LeepYear");
        }else{
            System.out.println("This is not LeepYear");
        }

    }
}
