
//has private method and private variable

public class PrivateAccessModifier {
private void privateMethod() {
	System.out.println("hi from privateMethod");
}

private int x=20;
public static void main(String[] args) {
	PrivateAccessModifier obj=new PrivateAccessModifier();
	obj.privateMethod();
	System.out.println("value of x "+obj.x);
	
	//accessing public method
	//from PublicAccessModifier Class
	
	PublicAccessModifier2 obj2=new PublicAccessModifier2();
	obj2.publicMethod();
}
}
