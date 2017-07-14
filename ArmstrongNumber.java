package practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        // Armstrong numbers between 1 to 500
        for(int i=1;i<=500;i++){
            int temp = i;                           // because if we use n, then in while loop its value will be zero.
            int sum = 0,digit;
            while(temp>0){
                digit = temp%10;
                sum += digit*digit*digit;
                temp = temp/10;
            }
            if(sum == i){
                System.out.println(i);
            }
    //        if(sum == n){
    //            System.out.println("Armstrong Number");
    //        }
    //        else{
    //            System.out.println("Not");
    //        }
        }
    }
}
