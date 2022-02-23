// MathServer.java : An implementation of the MathServer. 
import java.io.*; 
import java.net.*;
public class CalcServer{   
public static void main(String [] args)throws Exception{  
  int port = 10000; 
  ServerSocket serverSocket = new ServerSocket(port); 
  while(true)
  {     
  Socket socket = serverSocket.accept();      
  CalcInterface calculator = new CalcInterfaceImpl();
  String response = “”;
  double result = Double.MAX_VALUE;  
  BufferedReader inFromClient = new BufferedReader(             
  new InputStreamReader(socket.getInputStream()));             
  String line = reader.readLine();        
  String [] tokens = line.split(“\\s+”);      
  if (tokens.length != 3)        
	response = “Parsing Error”;
	
 double firstValue = 0;
 double secondValue = 0;     
 try {        
 firstValue = Double.parseDouble(elements[0]);        
 secondValue = Double.parseDouble(elements[2]);      
 }catch(Exception e) {        
  response = “Invalid arguments!”;     
 }      
 switch (elements[1].charAt(0)) {  
 case ‘+’:           
 result = calculator.add(firstValue, secondValue);
 response = Integer.toString(result);      
 break; 
     case ‘-’:	
     result = calculator.sub(firstValue, secondValue);
     response = Integer.toString(result);        
     break;        
     
     case ‘*’:          
     result = calculator.mul(firstValue, secondValue); 
     response = Integer.toString(result);      
     break;        
     case ‘/’:         
     result = calculator.div(firstValue, secondValue);
     response = Integer.toString(result);
     break;        
     default:          
     response = “Invalid math operation!”; 
     DataOutputStream outToClient = new DataOutputStream(             
     socket.getOutputStream());        
     outToClient.writeBytes(response);        
     inFromClient.close();        
     outToClient.close();     
     } catch (Exception e) {        
	  e.printStackTrace();     
     }  
   }
 }
}                 	
