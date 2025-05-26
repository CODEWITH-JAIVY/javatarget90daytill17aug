package Day04import.Student;

public class Student {
    private int Roll_number  ;
    private String Name  ;
    public void setStudentDetail(int roll_number , String name ) {
        Roll_number = roll_number  ;
        Name = name  ;
    }
    public void displayData(){
        System.out.println("Name of the studemt  :-" + Name);
        System.out.println("Roll nmumber of the student :- " +Roll_number);
    }
    
}
