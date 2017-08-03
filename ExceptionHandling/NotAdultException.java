package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotAdultException{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("Enter age - ");
            int age = Integer.parseInt(br.readLine());
            if(age < 18){
                throw new InvalidAgeException("Not adult");
            }
            else{
                System.out.println("Adult");
            }
        }
        catch(InvalidAgeException | IOException | NumberFormatException e){
            System.out.println(e);
        }
    }

}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}
