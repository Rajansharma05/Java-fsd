package AssistedPractice;

public class StringConversion {

    public static void main(String[] args) {
        // Create a string
        String str = "Hello, World!";

        // Convert string to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);

        // Convert string to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);

        // Display the conversions
        System.out.println("String: " + str);
        System.out.println("StringBuffer: " + stringBuffer.toString());
        System.out.println("StringBuilder: " + stringBuilder.toString());
    }
}

