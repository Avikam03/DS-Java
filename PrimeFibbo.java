package practice;

public class PrimeFibbo {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int third;
        //System.out.print(first + " " + second + " ");
        for(int i=0;i<10;i++){
            third = first + second;
            if(isPrime(third) == true && third!=1){
                System.out.print(third + " ");
            }
            first = second;
            second = third;
        }
    }

    private static boolean isPrime(int third) {
        int flag = 0;
        for(int i=2;i<=Math.sqrt(third);i++){
            if(third%i==0){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
