// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,i=0;
		System.out.println("Enter a number : ");
		num1 = sc.nextInt();
		for(i=0;i<num1;i++){
		    System.out.println("Programm ended at : "+i);
		}
		//Performing the same task by using while loop
		/*
		while(num1 != i){
		    System.out.println("Progammed ended at :"+i);
		    i++;
		}
		*/
		
		//Performing the same task by using do while loop
		/*
		do{
		    System.out.println("Program ended at : "+i);
		    i++;
		}while(num1 != i);
		*/
		sc.close();
	}
}

//Have a look in a enhanced or advanced for loop in java
