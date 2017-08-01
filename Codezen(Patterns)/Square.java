/*
    ****
    *  *
    *  *
    ****
*/
package Patterns;

public class Square {
    public static void main(String[] args) {
        int i,j;
        for(j=1;j<=4;j++){
            System.out.print("*");
        }
        System.out.println();
        for(i=1;i<=2;i++){
            for(j=1;j<=4;j++){
                if(j==1 || j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(j=1;j<=4;j++){
            System.out.print("*");
        }
    }
}
