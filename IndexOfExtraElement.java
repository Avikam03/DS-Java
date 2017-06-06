package practice;

public class IndexOfExtraElement {
    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 5, 8, 10, 12};
        int arr2[] = {2, 4, 6, 8, 10, 12};
        int i = 0,j = 0;
        while(i<=arr1.length && j<=arr2.length){
            if(arr1[i] == arr2[j]){
                
            }
            else{
                if(arr1.length < arr2.length){
                    System.out.println(++j);
                    break;
                }
                else{
                    System.out.println(++i);
                    break;
                }
            }
            i++;
            j++;
        }
    }
}
