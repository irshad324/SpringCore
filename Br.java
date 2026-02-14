
    

import java.io.*;   // Import for BufferedReader and InputStreamReader
      public class Br {
      
        
      
    public static void main(String[] args) throws IOException {
        // Create BufferedReader object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Taking string input
        System.out.print("Enter your name: ");
        String name = br.readLine();   // reads a full line as string

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine()); // convert string input to integer

        // Display output
        System.out.println("Hello, " + name + " 👋");
        System.out.println("Your age is: " + age);
    
}



}


























