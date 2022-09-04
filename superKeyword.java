class Animal{
	protected String creature = "ANIMAL";
	public void msg(){
		System.out.println("hello, I am a animal");
	}
}


class Dog extends Animal{
	public String creature = "DOGGY";
	//for dog call
	@Override
	public void msg(){
		System.out.println("Hello, I am a dog.");
	}
	
	//for animal call(we need to call our method from super class)
	public void callSuperMsg(){
		super.msg(); //this will not call within this block this will call the method present super class.
	}
	
	// implemtnation of calling attributes from super class by using super keyboard.
	public void Display(){
		System.out.println(creature);
		System.out.println(super.creature);
	}
}



class Main {
	public static void main(String[] args) {
		Dog labra = new Dog();
		// labra.msg();
		labra.callSuperMsg();
		labra.Display();
	}
}

/*
super -> bhai kuch nahi kr raha htumhare ly bs superclass ka method jo overrride bhi hua h, usko tumahre ly call kr deya.
tip. agr tumko siperclass ka method call krna h, us object ka method call nahi krna h(method override h) tho uss sititution m,
ek alg method banao enhrited class m(child class) ek alg naam ka , or uss method k ander super class ka method call kr dena.

Uses of super keyword
To call methods of the superclass that is overridden in the subclass.
To access attributes (fields) of the superclass if both superclass and subclass have attributes with the same name.  => super.attributes/variables name
To explicitly call superclass no-arg (default) or parameterized constructor from the subclass constructor.

NOTE -:  
*/