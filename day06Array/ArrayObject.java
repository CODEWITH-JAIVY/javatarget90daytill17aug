package day06Array;

class Student {
    String  name  ;
    int roll_number ;
    int age ;

}

public class ArrayObject {
    public static void main(String [] myObjStrings ) {

  Student s1 = new Student() ;
  s1.name = "Sanjeet kumar " ;
  s1.roll_number = 123456 ;
  s1.age = 23 ;

  Student s2  = new Student() ;
  s2.name = "Jaivy Roy" ;
  s2.roll_number = 654321 ;
  s2.age  = 25 ;

  Student s3 = new Student() ;
  s3.name = "Krishana kumar Roy " ;
  s3.roll_number  = 987654 ;
  s3.age =  21 ;
   Student[] students =  { s1 , s2 , s3 } ; 
    for(int i=0 ; i<students.length; i++ ) {
        System.out.println("Name:-" + students[i].name  );
        System.out.println("Roll Number :-" + students[i].roll_number );
        System.out.println("Age :-" + students[i].age  );
        System.out.println();
        

    }

}
    
}
