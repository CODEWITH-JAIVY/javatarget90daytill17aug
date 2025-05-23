

 class Student {
    String name;             // instance variable
    int rollNumber;          // instance variable
    static String college = "GNIM"; // static variable (shared by all)

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("College: " + college);
    }

    // Static method to change college name for everyone
    public static void changeCollege(String newCollege) {
        college = newCollege;
    }
}
public class Testmain  {
    public static void main(String[] args) {
        Student s1 = new Student("Jaivy", 101);
        Student s2 = new Student("Ravi", 102);

        s1.display();
        s2.display();

        System.out.println("Changing college name...");

        Student.changeCollege("IIT Delhi"); // static method

        s1.display(); // College name changed for everyone
        s2.display();
    }
}
