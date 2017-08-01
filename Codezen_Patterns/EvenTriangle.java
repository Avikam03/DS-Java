/*
        **
       ****
      ******
     ********  
*/
package Codezen_Patterns;

public class EvenTriangle {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            // spaces
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            // *
            for(int k=2;k<=2*i+2;k++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
