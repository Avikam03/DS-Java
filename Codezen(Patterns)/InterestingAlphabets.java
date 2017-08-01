/*
        E
       DE
      CDE
     BCDE
    ABCDE 
*/
package Patterns;

public class InterestingAlphabets {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            // spaces
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            // Characters
            for(int l=5-i;l<=5;l++){
                System.out.print((char)(64+l));
            }
            System.out.println();
        }
    }
}
