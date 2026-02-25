package Constructor;

public class StaticConstructor {
	public StaticConstructor() {
		System.out.println("is a constructor");
	}
	
	private void m1() {
		//StaticConstructor();
	}
	public static void main(String[] args) {
		System.out.println(10);			//prints 10
		System.out.println("10"+5);		//prints 105 as 10 is a string
	}
}

/*
 * Constructors are called only when creating an object
 * 
 * They cannot be called like regular methods
 * 
 * They must be invoked using new
 */