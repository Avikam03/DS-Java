/*
    333
    233
    123
*/
package Codezen_Patterns;

public class NumberPattern {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=3-i;j<3;j++){
                System.out.print(j);
            }
            for(int k=3;k>i;k--){
                System.out.print("3");
            }
            System.out.println();
        }
    }
}
