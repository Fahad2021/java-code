
package startjava;
import java.util.Scanner;
    
public class InputDemo {
    
   
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Enter anumber:");
        number=input.nextInt();
        System.out.println("Number ="+number);
        
    }
    
}
