import Random.ProtectedMethodParent;
// package_name.class_name = is from where we are receiving the parent class


public class ProtectedMethodChild extends ProtectedMethodParent {
protected void myMethod() {
	System.out.println("from protected method of child class");

}
public static void main(String[] args) {
	//child has the method of its parent now it can directly work on the method
	
	ProtectedMethodChild obj=new ProtectedMethodChild();
	obj.myMethod();
}
}
