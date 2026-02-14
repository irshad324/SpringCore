public class primeN {
    public static void main(String[] args) {
     int N=7;
     int count=0;
     for(int i=1; i<=N; i++){
        if(N%2==0){ 
         count++;
        }
     
     if (count==2) {
        System.out.println("Num is Prim");
     }else{ 
    System.out.println("N is not prime");
     }
    }
}
}
