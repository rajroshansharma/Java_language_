//abstract class
abstract class Transport{
	//abstract method
	abstract public void startTransport();
	
	//regular method
	public void addPetrol(){
		System.out.println("Petrol is filling.");
	}
	//The abstract class can have both abstract method and regular methods.
}


class Bike extends Transport{
	// provide implementation of abstract method
	public void startTransport(){
		System.out.println("Bike is getting started!");
	}
}


class Main{
	public static void main(String[] args){
		Bike pulsar = new Bike();
		pulsar.startTransport();
		pulsar.addPetrol();
	}
} 

// Key Points to Remember
// We use the abstract keyword to create abstract classes and methods.
// An abstract method doesn't have any implementation (method body).
// A class containing abstract methods should also be abstract.
// We cannot create objects of an abstract class.
// To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
// A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
// We can access the static attributes and methods of an abstract class using the reference of the abstract class. For example,