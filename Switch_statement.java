public class Main {
	public static void main(String[] args) {
		int num1 = 2;
		switch(num1){
			case 1 : System.out.println("Hello, World ONE");
			break;
			case 2 : System.out.println("Hello, World two");
			break;
			default : System.out.println("INVALID INPUT");
		}
		
	}
}


/*
switch(expression){    
case value1:    
 //code to be executed;    
 break;  //optional  
case value2:    
 //code to be executed;    
 break;  //optional  
......    
    
default:     
  code to be executed if all cases are not matched;  
}    
*/