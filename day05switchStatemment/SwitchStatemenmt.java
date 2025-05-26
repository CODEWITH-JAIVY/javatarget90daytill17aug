package day05switchStatemment;

public class SwitchStatemenmt {
    public static void main(String[] args) {
        String day = "Monday"; // Removed 'public' and fixed variable naming convention

        switch (day) {
            case "Sunday" -> System.out.println("Sunday");
            case "Monday" -> System.out.println("Monday");
            case "Tuesday" -> System.out.println("Tuesday"); // Corrected spelling
            default -> System.out.println("Not a valid day"); // Optional default case
        }
    }
}

//  at the place  of print the direct case matcing we can store on  another variable   than we can print it or retunr it 
//Another way to return 
 /* return swith( ) {} */ 