class calculator  {
  int num  = 10 ;
  int add ( int num1 , int nums2 ) {
    System.out.println("inside stack tha value of num" +num);
    return num1+ nums2  ;
  }

}

public class heap {
public static  void main (String [] args ) {
      calculator obj  = new calculator()  ; 
      calculator obj1  = new calculator() ;
      int result = obj.add(10, 10) ;
      obj.num = 50 ; 
      System.out.println(obj1.num);
      System.out.println(obj.num);
      System.out.println(result);

}

}
