package AssistedPractice;

public class OuterClass {
    private int outerVariable = 10;

    public void outerMethod() {
        System.out.println("Outer method");
    }

    // inner class 
    public class InnerClass {
        private int innerVariable = 20;

        public void innerMethod() {
            System.out.println("Inner method");
        }

        public void accessOuterMembers() {
            System.out.println("Outer variable: " + outerVariable);
            outerMethod();
        }
    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        InnerClass innerObject = outerObject.new InnerClass();

        innerObject.innerMethod();
        innerObject.accessOuterMembers();
    }
}
