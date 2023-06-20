package AssistedPractice;

public class Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass obj = new MyClass();
		
		obj.publicMethod();
		System.out.println(obj.publicVariable);
		
		obj.protectedMethod();
		System.out.println(obj.protectedVariable);

		obj.defaultMethod();
		System.out.println(obj.defaultVariable);


	}

}

class MyClass{
	public String publicVariable = "I am Public";
	protected String protectedVariable = "I am protected";
	String defaultVariable = "I am default";
	private String privateVariable = "I am private";
	
	public void publicMethod() {
		System.out.println("This is public method");
	}
	
	public void protectedMethod() {
		System.out.println("This is public method");
		
	}
    void defaultMethod() {
		System.out.println("This is public method");
		
	}
    private void privateMethod() {
		System.out.println("This is public method");
		
	}

}
