package AssistedPractice;

public class Arrays {

    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Accessing and modifying array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
            numbers[i] = numbers[i] * 2;
        }

        // Verifying the modified array elements
        System.out.println("\nModified array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}


