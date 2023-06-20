package AssistedPractice;

public class Methods {

	public static void main(String[] args) {
		//create a instance
		Methods obj = new Methods();
		
		//Directly calling the method
		int sum = obj.addNumbers(5, 10);
		System.out.println("Sum: "+sum);
		
		//calling a method without argument
		String message = obj.greet();
		System.out.println("message: "+ message);
		
		//calling a method with argument but not receive the return value
		obj.printName("john");
		
		//calling a method with different number argument using overloading
		int product1 = obj.multiplyNumbers(2, 5);
		int product2 = obj.multiplyNumbers(2, 5, 6);
		
		System.out.println("product 1 : "+ product1);
		System.out.println("product 2 : "+ product2);
		
		int difference = Methods.substractNumbers(18, 8);
		System.out.println("Difference : "+ difference);

	}
	
	private int multiplyNumbers(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i*j*k;
	}

	private static int substractNumbers(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public int addNumbers(int a, int b) {
		return a+b;
	}
	public String greet() {
		return "Hello ji";
	}
	public void printName(String name) {
		System.out.println("Name: "+ name);
	}
	
	public int multiplyNumbers(int a, int b) {
		return a + b;
	}

}
