package practice;

import java.util.Arrays;

public class BubbleSortNumbers {
    public static void main(String[] args) {
        int[] arr = {3,6,2,9,1,7,5}; 
        System.out.println(Arrays.toString(sort(arr)));
    }

    private static int[] sort(int[] _arr_) {
        for(int i=0;i<_arr_.length;i++){
            for(int j=0;j<_arr_.length-i-1;j++){
                if(_arr_[j]>_arr_[j+1]){
                    int temp;
                    temp = _arr_[j];
                    _arr_[j] = _arr_[j+1];
                    _arr_[j+1] = temp;
                }
            }
        }
        return _arr_;
    }
    
}
