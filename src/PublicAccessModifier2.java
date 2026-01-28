
//public access modifier with method and variable

public class PublicAccessModifier2 {
	public void publicMethod() {
		System.out.println("this is public method");
	}
	
	public int x=70;
	
	public static void main(String[] args) {
		PublicAccessModifier2 obj=new PublicAccessModifier2();
		obj.publicMethod();
		
		System.out.println(obj.x);
		
		//trying to access private method from same package
		
		
		//PrivateAccessModifier obj1=new PrivateAccessModifier();
		
		//obj1.privateMethod(); 
		//this is not visible as private is accessible 
		//within the same class
		
		
		DefaultAccessModifier newObj=new DefaultAccessModifier();
		newObj.myMethod();
		System.out.println("value of x from default: "+newObj.x);
	}
}
