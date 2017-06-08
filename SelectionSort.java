package practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {3,2,1,4,5,6};
        System.out.println(Arrays.toString(selection_sort(a)));
    }

    private static int[] selection_sort(int a[]) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }      
        return a;
    }
}
