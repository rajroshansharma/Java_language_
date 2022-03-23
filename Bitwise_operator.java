public class Main {
	public static void main(String[] args) {
		int num1, num2;
		//num1 = 65;
		num1 = 5;
		num2 = 7;
		System.out.println("Left shift bitwise operator"+(num1 << 1));
		//the operator << is called a left shift operator, this will the shift the 
		//num1 by 1 unit
		
		System.out.println("Right shift bitwise operator"+(num1 >> 1));
		
		System.out.println("AND bitwise operator : " + (num1 & num2));
		System.out.println("OR bitwise operator : " + (num1 | num2));
		System.out.println("NOT bitwise operator : " + (~num2));
		System.out.println("XOR bitwise operator : " + (num1 ^ num2));
		
	}
}
