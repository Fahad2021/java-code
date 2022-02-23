// MathClient.java: A test client program to access CalcServer. 
import java.io.*; 
import java.net.Socket; 
public class CalcClient {   
public static void main(String [] args){      
String hostname = “localhost”;      
int port = 10000;       
 try {        
 // create a socket        
 Socket socket = new Socket(hostname, port);       
 // perform a simple math operation “12 + 21”        
 DataOutputStream outToServer = new DataOutputStream(                
 socket.getOutputStream()));        
 outToServer.writeBytes(“12 + 21”);        
  
// get the result from the server        
 BufferedReader inFromServer = new BufferedReader(                
 new InputStreamReader(socket.getInputStream()));        
 System.out.println(inFromServer.readLine());       
 outToServer.close();        
 inFromServer.close();      
 } catch (Exception e) {        
 e.printStackTrace();      
 }   
  } 
}
