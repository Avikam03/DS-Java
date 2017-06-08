package practice;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {1,5,2,8,3,6};
        for(int i=0;i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            while(j>=0 && temp<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        System.out.println(Arrays.toString(array));
    } 
}
