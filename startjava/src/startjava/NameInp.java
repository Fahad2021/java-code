
package startjava;
import java.util.Scanner;
    
public class NameInp {
    
   
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        String name;
        System.out.print("Enter your name:");
        name=input.next();
        System.out.println("welcome "+name);
        
    }
    
}
