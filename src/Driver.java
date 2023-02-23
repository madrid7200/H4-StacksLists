import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		String archivo = "datos.txt";
		String infix = "";
		String postfix = "";
		ARStack<String> postStack = new ARStack<>();
		
		
		File file = new File(archivo);
		Scanner sc = new Scanner(file);
		
		infix = sc.nextLine();
		String[] itemsInFX = infix.split("");
		
		String result = "";
		
		for (String item : itemsInFX) {
			switch (item) {
	        case "+":
	        	 postStack.push(item);

	        	//
	            break;
	        case "-":
	        	 postStack.push(item);

	        	//
	       	 break;
	        case "*":
	        	 postStack.push(item);

	        	//
	            break;
	        case "/":
	        	 postStack.push(item);

	        	//
	            break;
	        case ")":
	        	
	        	result = postStack.pop();
	        	
	        	while (result !=")") {
	        		postStack.push(result);
	        		result = postStack.pop();
				}
	        	
	            break;
	        case "(":	
	        	 postStack.push(item);

	        	//
	            break;
	        default: 
	        	postfix = postfix + item + " ";
	        	}
			}	
		
		postfix = sc.nextLine();
		String[] itemsPost = postfix.split(" ");
		
		calcPostfix(itemsPost,postStack);		
	}

	private static  void calcPostfix(String[] items, ARStack<String> postStack) {
		
		Calculator calucu = new Calculator();
		float item1; 
		float item2;
		float result;
		
		
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
	// TODO Auto-generated method stub
	
}

}







