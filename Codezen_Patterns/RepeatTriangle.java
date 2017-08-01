/*
    ABCCBA
     ABBA
      AA
*/
package Codezen_Patterns;

public class RepeatTriangle {
    public static void main(String[] args) {
        int n = 3;
        for(int i=0;i<3;i++){
            // spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            
            // Ascending order
            for(int k=0;k<n;k++){
                System.out.print((char)(k+65));
            }
            // Descending order
            for(int l=n-1;l>=0;l--){
                System.out.print((char)(l+65));
            }
            
            System.out.println();
            n--;
        }
    }
}
