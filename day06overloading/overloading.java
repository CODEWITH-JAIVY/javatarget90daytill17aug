package day06overloading;

public class overloading {
    public  int add(int a , int b ) {
        return a+ b  ;
    }
    public int add( int a , int b ,int c ) {
        return   a + b + c  ;
    }
    public int add( int a , float b ) {
        return a + (int) b   ; 
    }
    public static void main ( String [] args ) {
        int  result  ;
        overloading obj = new overloading() ;
        //   result = obj.add(8, 1.5) ;
          result = obj.add(1, 8) ;
        //   result = obj.add(1, 2, 8) ;
        System.out.println(result); 

    }
    
}
