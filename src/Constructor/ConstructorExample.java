package Constructor;


//Default constructor
public class ConstructorExample {
	int x;
	public static void main(String[] args) {
	ConstructorExample obj=new ConstructorExample(); //ConstructorExample() is initializing a new object
	System.out.println(obj.x);
	}
}
/*	the variable here is not initialized
 *	yet it will be receiving the default value
 *	because of the default constructor 
 */
