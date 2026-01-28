
public class DefaultAccessModifier {
void myMethod() {
	System.out.println("this is default method");
}
int x=45;
public static void main(String[] args) {
	ProtectedMethodChild obj=new ProtectedMethodChild();
	obj.myMethod();
}
}
//conclusion
/*protected method or variable behaves as default method or variable
 * within the same package
 */