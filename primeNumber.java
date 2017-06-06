package practice;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Not prime.");
        }
        else{
            System.out.println("Prime.");
        }
    }
}
