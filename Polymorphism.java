class mobile{
	private String company;
	private String model;
	private int price;
	
	//constructor without argument
	public mobile(){};
	
	//constructor with argument
	public mobile(String company, String model, int price){
		this.company = company;
		this.model = model;
		this.price = price;
	}
	
	//getters & setters
	public String getCompany(){
		return this.company;
	}
	public String getModel(){
		return this.model;
	}
	public int getPrice(){
		return this.price;
	}
	
	public void setCompany(String company){
		this.company = company;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	//mobile starting 
	public void mobileStarting(){
		System.out.println("Mobile has started!");
	}
	
	//mobile price is low or high
	public void mobilePrice(int price){
		if(price > 50000){
			System.out.println("Price is very high!");
		}
		else{
			System.out.println("Price is low!");
		}
	}
	
	//implementiation of polymorphism => diffrent forms (methods as well as variables)
	/*
	@ types of polymorphism
	1. Static Polymorphism (compile time polymorphism/ Method overloading): -> The ability to execute different method implementations by
	   altering the argument used with the method name is known as method overloading.
	2. Dynamic Polymorphism (run time polymorphism/ Method Overriding): -> 
	*/
	//calling status(1. Static Polymorphism (compile time polymorphism/ Method overloading))
	public void MobileCalling(){
		System.out.println("STAGE 1 :Phone is not calling anyone!");
	}
	public void MobileCalling(int status){
		if(status == 1){
			System.out.println("STAGE 2 :Phone is ringing.");
		}
	}
	public void MobileCalling(int status1, int status2){
		if(status2 == 2){
			System.out.println("STAGE 3 :Phone is in talking Process.");
		}
	}
	public void MobileCalling(int status1, int status2, int status3){
		if(status3 == 3){
			System.out.println("STAGE 4 :Phone has been terminated from talking process few minutes ago.");
		}
	}
}

class Tablet extends mobile{
	public int displaySize;
	
	public int getSize(){
		return displaySize;
	}
	public void setSize(int displaySize){
		this.displaySize = displaySize;
	}
	//mobile price is low or high
	/* Dynamic Polymorphism (run time polymorphism/ Method Overriding) -> 
		i have defined mobilePrice in the super class also then i also defeined it the child class and changed the actions
		and called throught the Object refrence.
	*/
	public void mobilePrice(int price){
		if(price > 20000){
			System.out.println("Price is very high!");
		}
		else{
			System.out.println("Price is low!");
		}
	}
	
}

public class Main{
	public static void main(String[] args){
		mobile m1 = new mobile("SAMSUNG", "M1", 56600);
		System.out.println(m1.getCompany());
		m1.MobileCalling();
		m1.MobileCalling(1);
		m1.MobileCalling(1,2);
		m1.MobileCalling(1,2,3);
		
		Tablet m2 = new Tablet();
		m2.setCompany("RealMe") ;
		m2.setSize(14);
		m2.setPrice(19000);
		m2.mobilePrice(m2.getPrice());
		
	}
}