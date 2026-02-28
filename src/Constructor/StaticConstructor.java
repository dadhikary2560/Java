package Constructor;

public class StaticConstructor {
	public StaticConstructor() {
		System.out.println("is a constructor");
	}
	
	private void m1() {
		//StaticConstructor();
		System.out.println("method m1");
	}
	public static void main(String[] args) {
		System.out.println(10);			//prints 10
		System.out.println("10"+5);		//prints 105 as 10 is a string
		StaticConstructor obj=new StaticConstructor(); //no matter what, to call constructor
													  //new is needed
		obj.m1();
	}
}

/*
 * Constructors are called only when creating an object
 * They cannot be called like regular methods
 * They must be invoked using new
 */