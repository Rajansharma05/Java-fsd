package AssistedPractice;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit casting
		
		int i = 100;
		long l = i;
		float f = l;
		
		System.out.println("Int Value " + i);
		System.out.println("long Value " + i);
		System.out.println("float Value " + f);
		
		//explicit casting
		
		double d = 100.04;
		long l1 = (long)d;
		int i1 = (int)l1;
		
		System.out.println("WE ARE GOING TO IMPLEMENT EXPLICIT CASTING");

		System.out.println("double Value " + d);
		System.out.println("long Value " + l1);
		System.out.println("Int Value " + i1);
		
		
		
	}

}
