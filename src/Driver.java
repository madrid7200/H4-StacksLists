import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		String archivo = "datos.txt";
		String infix = "";
		String postfix = "";
		String result = "";
		
		//Reads and splits textx from the .txt "datos.txt"
		File file = new File(archivo);
		Scanner sc = new Scanner(file);
		infix = sc.nextLine();
		String[] itemsInFX = infix.split("");
		
		//User input scanner
		Scanner scan = new Scanner(System.in);
		
		int opcion = 0;
		System.out.println("Stack infix to postFix");
		System.out.println("");
	 	System.out.println("Que tipo de estructura desea usar?");		
		System.out.println("1. Array");
		System.out.println("2. ArrayList");
		System.out.println("3. Lista");
		System.out.println("");
		System.out.println("ingrese su opcion:");
		opcion = scan.nextInt();

		
		if (opcion == 3) {
			System.out.println("Stack infix to postFix");
			System.out.println("");
		 	System.out.println("Que tipo de Lista desea usar?");	
			System.out.println("1 Linked List");
			System.out.println("2 Double Linked list ");
			System.out.println("");
			System.out.println("ingrese su opcion:");
			opcion = scan.nextInt();

			
		}else {
			//class Factory
			
		}
		ArrayListStack<String> postStack = new ArrayListStack<>();
		
		//Convert infix to postfix
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
	        	
	        	while (result !="(") {
	        		postfix = postfix + result + " ";
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
		int size = postStack.Size();
	    for (int i = 0; i < size; i++) {
	    	postStack.pop();
	    }
		
		
		postfix = sc.nextLine();
		String[] itemsPost = postfix.split(" ");
		
		calcPostfix(itemsPost,postStack);		
	}

	private static  void calcPostfix(String[] items, ArrayListStack<String> postStack) {
		
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







