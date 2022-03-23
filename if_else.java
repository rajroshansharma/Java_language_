public class Main {
	public static void main(String[] args) {
		int num1;
		int num2;
		
		num1 = 120;
		num2 = 300;
		
		if (num1 > num2){
			System.out.println(num1 + " is greater than " + num2);
			if(num2%2 == 0){
				System.out.println("Even number");
			}
		} 
		else if(num1 < num2){
			System.out.println(num1 + " is Less than " + num2);
			if(num2%2 == 0 || num2%3 == 0){
				System.out.println("Even number And divisble by 3");
			}
		}
		else if(num1 == num2){
			System.out.println(num1 + " is equal to " + num2);
		}
		else{
			System.out.println(num1 + " and " + num2 + " are invalid numbers! Please check");
		}
		
		System.out.println("Programm is ended");
		
	
		
	
	}
}
