package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryCatch {
    public static void main(String[] args){
        int a = 3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b;
        try{
            b = Integer.parseInt(br.readLine());
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("It will execute even after exception.");
        }
    }
}


/*

                                    Throwable
                                         |       
                                    Exception
                                         |
                                 RuntimeException
                          |                         |
                        Checked                 Unchecked
                          |                         |
                     IOException                ArrayIndexOutOfBound
                                                ArithmeticException

- We add a try block if we think that expression code is critical(which can generate error)
- Whenever exception is found in the try block, the control passes to the catch block without executing the rest
  of the try block.
- If we do not know the name of the exception that can occur, then we can define a catch block with name 
    "Exception".
- Any runtime anomaly which disturbs the flow of execution of program is Exception.
- Finally block will execute even after the exception has occured.
- There can be multiple catches with a try.
- Throws keyword is used to suppress the exceptions. But it does not handle exceptions.

  

*/