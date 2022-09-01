public class Main {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		// for (i=1;i<=10 ;i++ ){
		// 	sum = i + sum;
		// } 
		
		// for(i=1;i<10;i++){
		// 	if(i%2 == 0){
		// 		sum = i + sum;
		// 	}
		// }
		
		// for(i=0;i<10;i++){
		// 	if(i%2 == 0){
		// 		continue;
		// 	}
		// 	System.out.println(i);
		// 	sum = i + sum;
		// }
		for(i=1;i<=10;i++){
			if(i == 5){
				break;
			}
			System.out.println(i);
		}
		// The return keyword finished the execution of a method, and can be used to return a value from a method.
		// The break keyword is used to break out a for loop, a while loop or a switch block.
		 //The continue statement is used to skip the current iteration of the loop.
		
		System.out.println(sum);
	}
}
