public class Main {
	public static void main(String[] args) {
		//unary : - +
		//binary : + - * / %
		//ternary : ? :
		//relational : < <= >= == !=
		// logical and or !
		
		int n1,n2, result,result_two=5;
		n1 = 10;
		n2 = 5;
		
		result = n1+n2;
		System.out.println("Addition = " + result); 
		
		result = n1-n2;
		System.out.println("Substration = " + result); 
		
		result = n1*n2;
		System.out.println("Multipliction = " + result); 
		
		result = n1/n2;
		System.out.println("Division = " + result); 
		
		result = n1%n2;
		System.out.println("Module (reminder) = " + result); 
		
		//Short circuit operators: += -= *= /= %=
		//a+=b -> a = a+b
		result_two +=n2;
		System.out.println("Addition = " + result_two); 
		
		//ternary operators
		//expr1 ? expr2 : expr3;
		System.out.println(n1<n2 ? "n1 is greater than n2" : "Not grater than n2");
		//when we will use the ternary operators then we will use in a expression manner as shown in the  34 line number.
		//we are saying that before ? it is checking ,it will return true or false,
		//true expression will be executed before :, and false expression will be executed after :.
		n2 = n1 > 5 ? 100:1000; // we can use it as this also, it will doing the calculation and storing it into n2
		
		//Relational operators
		System.out.println("n1 < n2 is " + (n1 < n2));
		System.out.println("n1 <= n2 is " + (n1 <= n2));
		System.out.println("n1 > n2 is " + (n1 > n2));
		System.out.println("n1 >= n2 is " + (n1 >= n2));
		System.out.println("n1 == n2 is " + (n1 == n2));
		System.out.println("n1 < n2 is " + (n1 != n2));
	}
}
