package Codezen_Patterns;

public class AlphaPattern {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                if(i>=j){
                    System.out.print((char)(65+i));
                }
            }
            System.out.println();
        }
    }
}
