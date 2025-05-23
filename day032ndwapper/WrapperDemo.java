

public class WrapperDemo {

    public static void main(String[] args) {
        // Using valueOf(): returns wrapper class object (Integer, Float, etc.)
        Integer a = Integer.valueOf("10");         // Converts String "10" to Integer object
        Float b = Float.valueOf("10.5");           // Converts String "10.5" to Float object

        // Using parseXXX(): returns primitive data types
        int c = Integer.parseInt("123");           // Converts String "123" to primitive int
        float d = Float.parseFloat("50.25");       // Converts String "50.25" to primitive float

        // Example of another way to convert String to primitive using wrapper object and value
        int f = Integer.valueOf("12").intValue();  // Convert to Integer object, then extract primitive int

        // Output to show values
        System.out.println("a (Integer) with valueOf(): " + a);
        System.out.println("b (Float) with valueOf(): " + b);
        System.out.println("c (int) with parseInt(): " + c);
        System.out.println("d (float) with parseFloat(): " + d);
        System.out.println("f (int) with valueOf().intValue(): " + f);
    }
}
