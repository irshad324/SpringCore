import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferr {
    

                     
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Write Your Name: ");
        String name = br.readLine();   // User se input 

        System.out.println("Hello, " + name);
    
}


    
}
