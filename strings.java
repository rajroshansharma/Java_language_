public class Main {
	public static void main(String[] args) {
		String s1 = "programing"; // Create a string using string litrals
		System.out.println(s1); // print system
		
		//Creating a string using new keyword
		String var_name = new String ("Data stored");
		
		//concating
		String s2 = "Welcome";
		//System.out.println(s2 + " Person one");
		
		//finding length
		int len_of_s2 = s2.length();
		//System.out.println("length of string s2 : "+len_of_s2);
		
		//join two java String
		String con_s1_s2 = s1.concat(s2);
		String s3 = " Welcomes";
		String con_s1_s3 = s1.concat(s3);
		System.out.println(con_s1_s3);
		//Here, the concat() method joins the second string to the first string and assigns it to the joinedString variable.
		
		//Compare two Strings
		//In Java, we can make comparisons between two strings using the equals() method
		
		String s4 = "Welcome";
		boolean result1;
		result1 = s4.equals(s2);
		System.out.println("s2 and s4 are equal : " + result1);
		
		if (s1.equals(s2)){
			System.out.println("s1 and s2 are equal.");
		} 
		else{
			System.out.println("s1 and s2 are not equal.");
		}
		
		//escape Characters
		// use the escape character
		String example = "This is the \"String\" class.";
		System.out.println(example);
		
		
		//Methods of java String
		//1. contains()  ,checks whether the string contains a substring
		System.out.println(s2.contains("come")); // true
		
		//https://www.programiz.com/java-programming/string
		//All methods list.
		
		
	}
}
