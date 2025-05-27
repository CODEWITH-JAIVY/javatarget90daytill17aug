package array;

public class twodArray {
    public static void main (String [] roy ) {
        int arr[][] = new int[3][2] ;
        for( int i = 0  ; i < 3  ; i++ ) {
            for( int j = 0  ;  j  <2 ; j++ ) {
                arr[i][j] = (int)  (Math.random()*10 ) ;
                System.out.print(arr[i] [j] + " ") ;
            }
            System.out.println();
        }
    }
}
 