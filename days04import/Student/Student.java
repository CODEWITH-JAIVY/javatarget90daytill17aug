package Student;

public class Student {
    private int roll_number;
    private String name;

    public Student(int roll_number, String name) {
        this.roll_number = roll_number;
        this.name = name;
    }

    public void displayData() {
        System.out.println("Student name :- " + name);
        System.out.println("Student Roll_number :- " + roll_number);
    }
}
