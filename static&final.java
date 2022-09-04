// final , static

class myMathlib{
	public static void addTwoNum(int num1, int num2){
		System.out.println(num1+num2);
	}
	public static int age;
}
// static -> mtlb kya agr tm class banaya or usme methods dala tho us method ko access krne k ley tere ko us class ka object bnana parega,
// bina bnay tm access nahi kr skta h agr tm us method k samne static likh do , tb tm usko access kr skta h bina object banay us class ka.
//syntax className.methodName(args)
//agr tm same class m use kr raha h static tho syntax methodName(args) .
/*EXAMPLE -> hm myMathlib ka method use kr rahe h bina uske object banay or variable bhi.*/

/*
final -> mtlb bhai ek baar jo final ho gya wahi rahega, usko koe repalce, override or extends nahi kr skta. baki call wagera kr skta h.
the final variable cannot be reinitialized with another value
the final method cannot be overridden
the final class cannot be extended
*/

/*super -> */
class Main{
	public static void sayHello(){ // defining a static method and accessing it within the class. koe or class m bhi yhi concept rahega.
		System.out.println("hello BRO");
	}
	public static void main(String[] args){
		//final varibles
		final int MYAGE = 18; // this value now can't be changed at any cost.
		myMathlib.addTwoNum(5,10);
		myMathlib.age = 67; //this static varibles are rarely used , static constants are used as static final variablename
		System.out.println(myMathlib.age);
		System.out.println(MYAGE);
	}
}