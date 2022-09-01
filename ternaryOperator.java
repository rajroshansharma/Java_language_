public class Main{
	public static void main (String[] args) {
		int age = 45;
		boolean v3 = false;
		
		boolean v2 = age > 18 ? v3=true : false;
		
		// boolean v3 = age > 18 ? v2=true : v2=false;
		
		System.out.println(v3);
		/*you can assign anythin you can call any value or you can write the returnable value directly.
		to the variable you have assigned it will automatically take it.*/
		// syntax  => variable = expression ? return/assign value(if True) :  return/assign value(if False)
		// during assigning note that variable is not exposed ot treated with a ternary operator.
	}
}