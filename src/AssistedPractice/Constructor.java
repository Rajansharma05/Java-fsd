package AssistedPractice;

public class Constructor {
		private String name;
		private int age ;
		
		//default
		public Constructor() {
			name = "Rajan";
			age = 21;
		}
		
		//Parameterized constructor
		public Constructor(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public static void main(String []args) {
			Constructor obj1 = new Constructor();
			System.out.println("Name: "+obj1.getName());
			System.out.println("Age: "+obj1.getAge());
			
			Constructor obj2 = new Constructor();
			System.out.println("Name: "+obj2.getName());
			System.out.println("Age: "+obj2.getAge());	
		
	}

}
