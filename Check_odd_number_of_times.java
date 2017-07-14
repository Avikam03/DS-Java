package practice;

public class Check_odd_number_of_times {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        int i,j,count=0,flag=0;
        for(i=0;i<arr.length;i++){
            flag = 0;
            for(j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    flag = 0;
                    count++;
                }
                if(count>1 && count%2!=0){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1){
            System.out.println(arr[i]);
        }
    }
}
