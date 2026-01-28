package Constructor;


//Default constructor
public class DefaultConstructor {
	int x;
	public static void main(String[] args) {
	DefaultConstructor obj=new DefaultConstructor(); //DefaultConstructor() is initializing a new object
	System.out.println(obj.x);
	}
}
/*	the variable here is not initialized
 *	yet it will be receiving the default value
 *	because of the default constructor 
 */
