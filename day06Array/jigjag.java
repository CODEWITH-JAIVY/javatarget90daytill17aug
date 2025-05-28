package day06Array;

public class jigjag {
    void  arrayCreation() {
        int arr[][] = new int[3][] ;
         arr[0] = new int [4] ;
         arr[1] = new int[3] ;
         arr[2] = new int [5] ;

         for( int i =0 ; i< arr.length ;i++ ) {
            for( int j =0  ; j < arr[i].length;j++) {
                arr[i][j] = (int) ( Math.random()*100 ) ; 
            }
         }
         System.out.println("The jagged Array "); 

         for(int []m : arr) {
            for(int n : m) {
                System.out.print(n+" ");
            }
            System.out.println();
         }
    }

    public static void main(String[]DAy06) {
        jigjag obj = new jigjag() ;
        obj.arrayCreation();
    }
}
