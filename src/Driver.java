import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		String archivo = "datos.txt";
		String postfix = "";
		float item1; 
		float item2;
		float result;
		
		Calculator calucu = new Calculator();
		Stack<String> postStack = new Stack<>();
		
		File file = new File(archivo);
		Scanner sc = new Scanner(file);
		postfix = sc.nextLine();
		String[] items = postfix.split(" ");

		for (String item : items) {
			
			switch (item) {
	         case "+":
	        	 postStack.push(item);
	        	 
	        	 try {	
	        		 postStack.pop();
		        	 item1 = Float.parseFloat(postStack.pop());
		        	 item2 = Float.parseFloat(postStack.pop());
		        	 result = calucu.Add(item1, item2);
		        	 
		        	 postStack.push(String.valueOf(result));
					
				} catch (Exception e) {
					System.out.println("Non numeric value input");
				}	
				
	             break;
	         case "-":
	        	 postStack.push(item);
	        	 
	        	 try {	
	        		 postStack.pop();
		        	 item1 = Float.parseFloat(postStack.pop());
		        	 item2 = Float.parseFloat(postStack.pop());
		        	 result = calucu.Substraction(item2, item1);
		        	 
		        	 postStack.push(String.valueOf(result));
					
				} catch (Exception e) {
					System.out.println("Non numeric value input");
				}	
				
	        	 break;
	         case "*":
	        	 postStack.push(item);
	        	 
	        	 try {	
	        		 postStack.pop();
		        	 item1 = Float.parseFloat(postStack.pop());
		        	 item2 = Float.parseFloat(postStack.pop());
		        	 result = calucu.Multiply(item1, item2);
		        	 
		        	 postStack.push(String.valueOf(result));
					
				} catch (Exception e) {
					System.out.println("Non numeric value input");
				}	
				
	             break;
	         case "/":
	        	 postStack.push(item);
	        	 
	        	 try {	
	        		 postStack.pop();
		        	 item1 = Float.parseFloat(postStack.pop());
		        	 item2 = Float.parseFloat(postStack.pop());
		        	 result = calucu.Divition(item2, item1);
		        	 
		        	 postStack.push(String.valueOf(result));
					
				} catch (Exception e) {
					System.out.println("Non numeric value input");
				}
					 
	             break;
	         default:
	        	 postStack.push(item);	
	        	 System.out.println(item);
	             
	     }
			
			
		}
		System.out.println(postStack.pop());
		
		
		
		
	}


}
