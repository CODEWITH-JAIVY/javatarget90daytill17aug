import java.util.Scanner;

public class CommandLineInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[5];  // Create a new array to store input

        // Read 5 values from user input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            input[i] = sc.nextLine();
        }

        // Print the stored values
        System.out.println("\nYou entered:");
        for (int i = 0; i < input.length; i++) {
            System.out.println("Value " + (i + 1) + ": " + input[i]);
        }
    }
}
