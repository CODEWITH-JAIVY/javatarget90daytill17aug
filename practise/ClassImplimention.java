 
// public class  ClassImplimention {
    
//     private int  id ,  marks ;
//     private long  roll_number  ; 
//     private String name ;
//     public void setClassImplimention( int ID  , long  ROLL_NUMBER , int MARKS , String NAME   ){
//          id = ID ;
//          roll_number = ROLL_NUMBER  ;
//          marks = MARKS ;
//          name = NAME ;
//     }

//     public void  showClassImplimention(){
//         System.out.println("name  os the student :- " + name ) ;
//         System.out. println("Roll number " + roll_number) ;
//         System.out.println ("ID of the student :- " +  id) ;
//         System.out.println("Marks of the student :- " + marks ) ;
//     }

// public static void main( String [] args ) {
//    ClassImplimention student = new ClassImplimention() ;
//     student. setClassImplimention  (123  , 23101300311L  ,  80 , "jaivy Roy ") ;
//     student.showClassImplimention() ;
// }
// }

public class ClassImplimention {

private     int mouse  , keyboard , tochPad  ;
    public void setClassImplimention(int Mouse , int Keyboard , int TochPad) {
        mouse = Mouse  ;
        keyboard = Keyboard  ;
        tochPad = TochPad  ;
    }
    public void showClassImplimention() {
        System.out.println( "The list of the computer component in Qunatity ") ;
        System.out.println("Keyboard " + keyboard  ) ;
        System.out.println("TochPad :-" + tochPad ) ;
        System.out.println("mouse :-" + mouse );
    }

    public static void main(String [] args ) {
        ClassImplimention computerComponent  = new ClassImplimention() ;
        computerComponent.setClassImplimention(10, 50, 80);
        computerComponent.showClassImplimention();
    }
}