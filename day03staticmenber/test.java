 class staticmember {
   private  int y  ; // instant meber variable 
   static int staticYvalue ; // static member value only it can be used once 
   static int  variable  ; 
   public void setValue  (int Y  , int SATATICVALUE ) {
    y  = Y  ;
    staticYvalue = SATATICVALUE ;

   }
   public void ShowValue () {
    System.out.println( " Static Member value is " + staticYvalue  );
    System.out.println(" instan valiable value :- " + y ) ;

   }
  public static void fun1(   ) {
    variable  =  10 ; 
     System.out.println("STatice varible only acces by static funtion is  :- " +  variable);
      System.out.println( " Static Member value is " + staticYvalue  );
         
  }
  public static void fun2 () {
    System.out.println("STatice varible only acces by static funtion is  :- " +  variable);
      System.out.println( " Static Member value is " + staticYvalue  );
  }
   public  static class example {
     public static void  fun3() {
        int exampleVArivale   = 10  ;
       System.out.println("Inner class  Static varible :- " + exampleVArivale );
     }
   }
}
public class test {
   public static void main( String[]args) {
    staticmember  object = new staticmember() ;
    object.setValue(10,80);
  
    object.ShowValue(); 
    staticmember.fun1();

    System.out.println(" Static variable for fun 2 ");
    staticmember.fun2();
    staticmember.example.fun3()  ; 
   }

}


