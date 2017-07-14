package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_in_arr_equals_number {
    public static void main(String[] args) {
        int i,j = 0,flag = 0;
        int[] arr = {4,7,9,6,2};
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int left = 0, right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right] == sum){
                flag = 1;
                break;
            }
            else if(arr[left]+arr[right] < sum){
                left++;
                flag = 0;
            }
            else{
                right--;
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println(arr[left] + " " + arr[right]);
        }
    }
}
