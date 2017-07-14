package practice;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {7,5,4,4,3,1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i=0;i<a.length;i++){
            if(a[i] == n){
                break;
            }
        }
        int pos = i + 1;
        System.out.println("Number is found at position - " + pos);
    }
}
