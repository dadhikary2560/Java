package Constructor;

public class NoArgumentConstructor {
	
	int x;
	public NoArgumentConstructor() {
		x=18;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		new NoArgumentConstructor();
		//this is how we call a constructor method
	}
}
