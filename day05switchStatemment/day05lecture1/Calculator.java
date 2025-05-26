package day05switchStatemment.day05lecture1;

 
public class Calculator {
      int addtion(int num1 ,int  num2 ){
           return num1+num2 ; 
      }
    public static void main(String[] args) {
    Calculator cal  = new Calculator() ;
     int result = cal.addtion( 1,2) ;
     System.out.println("Sum of the number is :-" + result );
 }
    
}

 

